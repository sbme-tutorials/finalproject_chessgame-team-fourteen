

package pieces;

import board.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class King extends Pieces {

        public static boolean  firstMoveWK = true;
        public static boolean  firstMoveBK = true;
        //King Constructors
        public King() {
        }
        public King( PieceType pieceType,ColorPiece color,int currentRow,int currentColumn) {
            super(pieceType,color,currentRow,currentColumn);
        }

    /*public static voPieces.getId hasMoved(int fromRow, int fromCol){
        if (Pieces.getPieces.getId(fromRow, fromCol).equals("WK")){
            firstMoveKW = true;
        }
        else {
            firstMoveKB = true;
        }
    }*/
    /*public static boolean isFirstMove1(){
        if(!firstMoveK1)
            return false;
        return true;
    }
    public static boolean isFirstMove2(){
        if(!firstMoveK2)
            return false;
        return true;
    }*/
        //Move Function for King Override from Pieces

        public static boolean isMoveValid(int fromRow, int fromCol, int toRow, int toCol, char color) {
            int row = Math.abs(fromRow - toRow);
            int col = Math.abs(fromCol - toCol);

            if ((row == 1 && col == 0) || (row == 0 && col == 1) || (row == 1 && col == 1)||(King.castle('W').equals("ValidRightWRook") && toCol == fromCol+2  && toRow == fromRow) || (King.castle(color).equals("ValidLeftWRook") && toCol == fromCol-2 && toRow == fromRow ) || (King.castle(color).equals("ValidRightBRook") && toCol == fromCol+2 && toRow == fromRow) || (King.castle(color).equals("ValidLeftBRook") && toCol == fromCol-2 && fromRow == toRow)) {
                return true;
            } else {
                return false;
            }
        }

        public static String castle(char color) {
            String WRValid = "ValidRightWRook";
            String WLValid = "ValidLeftWRook";
            String BRValid = "ValidRightBRook";
            String BLValid = "ValidLeftBRook";
            String NonValid = "NotValid";
            // Check if the King and Rook are in their initial position
            switch (color) {
                case 'W': {
                    if (King.firstMoveWK && Rook.firstMoveRWR) {
                        if (isDistanceEmptyWR(color)) {
                            return WRValid;
                        }
                    }
                    if (King.firstMoveWK && Rook.firstMoveLWR) {
                        if (isDistanceEmptyWL(color)) {
                            return WLValid;
                        }
                    }
                }
                case 'B': {
                    if (King.firstMoveBK && Rook.firstMoveRBR) {
                        if (isDistanceEmptyBR(color)) {
                            return BRValid;
                        }
                    }
                    if (King.firstMoveBK && Rook.firstMoveLBR) {
                        if (isDistanceEmptyBL(color)) {
                            return BLValid;
                        }
                    }
                }
            }
            return NonValid;
        }
        // Check if the squares between the King and Rook are empty
        // In order to castle, the squares between the King and Rook must be empty

        private static boolean isDistanceEmptyWR(char color) {
//        //if (toCol == 2) { // QueenSide castling
//        for (int col = 1; col < 4; col++) {
//            if (Pieces.getId(7, col) != "  ") {
//                return false;
//            }
//        }
//        //}
//        return true;
            boolean flag = false;
            for(int i = 5 ; i <= 6 ; i++)
            {
                if(id[7][i] == "  "){
                    flag = true;
                }
            }
            return flag;
        }
        private static boolean isDistanceEmptyWL( char color) {
            boolean flag = false;
            for(int i = 1 ; i <= 3 ; i++)
            {
                if(id[7][i] == "  "){
                    flag = true;
                }
            }
            return flag;
        }
        private static boolean isDistanceEmptyBR (char color){
            boolean flag = false;
            for(int i = 5 ; i <= 6 ; i++)
            {
                if(id[0][i] == "  "){
                    flag = true;
                }
            }
            return flag;
        }
        private static boolean isDistanceEmptyBL (char color ){
            boolean flag = false;
            for(int i = 1 ; i <= 3 ; i++)
            {
                if(id[0][i] == "  "){
                    flag = true;
                }
            }
            return flag;
        }

   /* public static voPieces.getId movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        // Move the piece from the given position to the new position
        Pieces.getPieces.getId(toRow, toCol) = Pieces.getPieces.getId(fromRow, fromCol);
        Pieces.getPieces.getId(fromRow, fromCol) = "  ";
        Board.squares[toRow, toCol).setIcon(Board.squares[fromRow, fromCol).getIcon());
        Board.squares[fromRow, fromCol).setIcon("  ");
    }*/


        @Override
        public  String getPath(ColorPiece color) {
            return color==ColorPiece.White? "src/pieces/assets/white/WhiteKing.png" : "src/pieces/assets/black/BlackKing.png";
        }


    }

