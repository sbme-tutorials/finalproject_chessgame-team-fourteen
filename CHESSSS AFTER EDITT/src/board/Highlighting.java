package board;

import pieces.*;

import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

import static board.Board.squares;

public class Highlighting {
    public static void makeHighlihts(int fromRow, int fromCol) {
        char movingPieceType = Pieces.getId(fromRow, fromCol).charAt(1);
        char movingPieceColor = Pieces.getId(fromRow, fromCol).charAt(0);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (movingPieceType) {
                    case 'P' -> {
                        if (Pieces.isMoveValid(fromRow, fromCol, i, j)) {
                            if (Pawn.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) {
                                if (Pieces.getId(i, j) != "  " && Pieces.getId(i, j).charAt(1) == 'K'&& Pieces.getId(i, j).charAt(0) != movingPieceColor) {
                                    squares[i][j].setBackground(Color.YELLOW);
                                } else {
                                    squares[i][j].setBackground(Color.GREEN);
                                }
                            }
                        } else if (Pawn.isMoveValid(fromRow, fromCol, i, j, movingPieceColor) && Pieces.getId(i, j).charAt(0) == movingPieceColor) {
                            squares[i][j].setBackground(Color.RED);
                        }

                    }
                    case 'N' -> {
                        if (Pieces.isMoveValid(fromRow, fromCol, i, j)) {
                            if (Knight.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) {
                                if (Pieces.getId(i, j) != "  " && Pieces.getId(i, j).charAt(1) == 'K'&& Pieces.getId(i, j).charAt(0) != movingPieceColor) {
                                    squares[i][j].setBackground(Color.YELLOW);
                                } else {
                                    squares[i][j].setBackground(Color.GREEN);
                                }
                            }
                        } else if (Knight.isMoveValid(fromRow, fromCol, i, j, movingPieceColor) && Pieces.getId(i, j).charAt(0) == movingPieceColor) {
                            squares[i][j].setBackground(Color.RED);
                        }

                    }
                    case 'K' -> {
                        if (Pieces.isMoveValid(fromRow, fromCol, i, j)) {
                            if (King.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) {
                                squares[i][j].setBackground(Color.GREEN);
                            }
                            /*if (movingPieceColor == 'W') {
                                if (King.castle(6,'W').equals("ValidRightWRook")) {
                                    squares[7][6].setBackground(Color.GREEN);
                                }
                                if (King.castle(6, 'W').equals("ValidLeftWRook")) {
                                    squares[7][2].setBackground(Color.GREEN);
                                }
                            }if(movingPieceColor == 'B') {
                                if (King.castle(6,'B').equals("ValidRightBRook")) {
                                    squares[0][6].setBackground(Color.GREEN);
                                }
                                if (King.castle(6, 'B').equals("ValidLeftBRook")) {
                                    squares[0][2].setBackground(Color.GREEN);
                                }
                            }*/
                        } else if (King.isMoveValid(fromRow, fromCol, i, j, movingPieceColor) && Pieces.getId(i, j).charAt(0) == movingPieceColor) {
                            squares[i][j].setBackground(Color.RED);
                        }//else{
                            /*if (movingPieceColor == 'W') {
                                if (King.castle().equals("ValidRightWRook")) {
                                    squares[7][6].setBackground(Color.GREEN);
                                }
                                if (King.castle().equals("ValidLeftWRook")) {
                                    squares[7][2].setBackground(Color.GREEN);
                                }
                            }if(movingPieceColor == 'B') {
                                if (King.castle().equals("ValidRightBRook")) {
                                    squares[0][6].setBackground(Color.GREEN);
                                }
                                if (King.castle().equals("ValidLeftBRook")) {
                                    squares[0][2].setBackground(Color.GREEN);
                                }
                            }*/
                        //}
                    }
                    case 'B' -> {
                        if (Pieces.isMoveValid(fromRow, fromCol, i, j)) {
                            if (Bishop.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) {
                                if (Pieces.getId(i, j) != "  " && Pieces.getId(i, j).charAt(1) == 'K'&& Pieces.getId(i, j).charAt(0) != movingPieceColor) {
                                    squares[i][j].setBackground(Color.YELLOW);
                                } else {
                                    squares[i][j].setBackground(Color.GREEN);
                                }
                            }
                        } else if (Bishop.isMoveValid(fromRow, fromCol, i, j, movingPieceColor) && Pieces.getId(i, j).charAt(0) == movingPieceColor) {
                            squares[i][j].setBackground(Color.RED);
                        }

                    }
                    case 'R' -> {
                        if (Pieces.isMoveValid(fromRow, fromCol, i, j)) {
                            if (Rook.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) {
                                if (Pieces.getId(i, j) != "  " && Pieces.getId(i, j).charAt(1) == 'K'&& Pieces.getId(i, j).charAt(0) != movingPieceColor) {
                                    squares[i][j].setBackground(Color.YELLOW);
                                } else {
                                    squares[i][j].setBackground(Color.GREEN);
                                }
                            }
                        } else if (Rook.isMoveValid(fromRow, fromCol, i, j, movingPieceColor) && Pieces.getId(i, j).charAt(0) == movingPieceColor) {
                            squares[i][j].setBackground(Color.RED);
                        }

                    }
                    case 'Q' -> {
                        if (Pieces.isMoveValid(fromRow, fromCol, i, j)) {
                            if (Queen.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) {
                                if (Pieces.getId(i, j) != "  " && Pieces.getId(i, j).charAt(1) == 'K'&& Pieces.getId(i, j).charAt(0) != movingPieceColor) {
                                    squares[i][j].setBackground(Color.YELLOW);
                                } else {
                                    squares[i][j].setBackground(Color.GREEN);
                                }
                            }
                        } else if ((Rook.isMoveValid(fromRow, fromCol, i, j, movingPieceColor) || Bishop.isMoveValid(fromRow, fromCol, i, j, movingPieceColor)) && Pieces.getId(i, j).charAt(0) == movingPieceColor) {
                            squares[i][j].setBackground(Color.RED);
                        }
                    }
                }
            }
        }
        //if(!King.isMoveValid(fromRow, fromCol)){
        switch (movingPieceType) {
            case 'K' -> {

                if (movingPieceColor == 'W') {
                    if (King.castle('W').equals("ValidRightWRook")) {
                        squares[7][6].setBackground(Color.GREEN);
                    }
                    if (King.castle('W').equals("ValidLeftWRook")) {
                        squares[7][2].setBackground(Color.GREEN);
                    }
                }
                else {
                    if (King.castle( 'B').equals("ValidRightBRook")) {
                        squares[0][6].setBackground(Color.GREEN);
                    }
                    if (King.castle('B').equals("ValidLeftBRook")) {
                        squares[0][2].setBackground(Color.GREEN);
                    }
                }
            }
            case 'R' -> {
                if (movingPieceColor == 'W') {
                    if (King.castle('W').equals("ValidRightWRook")) {
                        squares[7][3].setBackground(Color.GREEN);
                    }
                    if (King.castle('W').equals("ValidLeftWRook")) {
                        squares[0][3].setBackground(Color.GREEN);
                    }
                } else {
                    if(King.castle('B').equals("ValidRightBRook")){
                        squares[7][5].setBackground(Color.GREEN);
                    }
                    if(King.castle('B').equals("ValidLeftBRook")){
                        squares[7][3].setBackground(Color.GREEN);
                    }
                }}
        }
    }





    public static void resetHighlights() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {     // checking for white and black squares in the chess board
                    squares[i][j].setBackground(new Color(139, 92, 9));

                } else {
                    squares[i][j].setBackground(new Color(250, 229, 192));
                }
                // Override the ButtonUI to make it non-clickable
                squares[i][j].setUI(new BasicButtonUI());

                //set the appearance of the button
                squares[i][j].setFocusPainted(false);
                squares[i][j].setBorderPainted(false);
                squares[i][j].setOpaque(true);
            }
        }
    }

}