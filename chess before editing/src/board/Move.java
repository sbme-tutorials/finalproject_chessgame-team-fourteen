package board;
import frames.*;
import pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static board.Board;
import static board.Board.*;


public class Move {


    // A method to move the piece
    public static int winner=0;
    static char movingPieceType;
    static char movingPieceColor;
    static char squareOccupiedType;
    static char colorOccupied;
    static ColorPiece color;
    static Pieces movingPiece;
    static Pieces isSquareOccupied;


    public static void movePiece(int fromRow, int fromCol, int toRow, int toCol) {

        movingPiece = pieceAt(fromRow, fromCol);
        movingPieceType = Pieces.getId(fromRow, fromCol).charAt(1);
        movingPieceColor = Pieces.getId(fromRow, fromCol).charAt(0);
        squareOccupiedType = Pieces.getId(toRow, toCol).charAt(1);
        colorOccupied = Pieces.getId(toRow, toCol).charAt(0);
        isSquareOccupied = pieceAt(toRow, toCol);
        if (movingPieceColor == 'W')
            color = ColorPiece.White;
        else
            color = ColorPiece.Black;
        if (Pieces.isMoveValid(fromRow, fromCol, toRow, toCol)) {

            switch (movingPieceType) {
                case 'P' -> {

                    if (Pawn.isMoveValid(fromRow, fromCol, toRow, toCol, movingPieceColor)) {

                        if (squareOccupiedType == ' ') {
                            squares[toRow][toCol].setPiece(new Pawn(PieceType.Pawn, color, toRow, toCol));
                            squares[fromRow][fromCol].setIcon(null);
                            piecesBox.add(new Pawn(PieceType.Pawn, movingPiece.getColor(), toRow, toCol));
                            piecesBox.remove(movingPiece);
                            Pieces.id[fromRow][fromCol] = null;
                            //System.out.println("PAWN VALID INSIDE OCCUI");
                            makPromotion(toRow, toCol, movingPiece);
                            if(movingPieceColor=='W')
                                state=2;
                            else
                                state=1;
                        } else {
                            if(!ischeckMate(toRow,toCol,colorOccupied)){

                                piecesBox.remove(isSquareOccupied);
                                squares[toRow][toCol].setIcon(null);
                                squares[fromRow][fromCol].setIcon(null);
                                squares[toRow][toCol].setPiece(new Pawn(PieceType.Pawn, color, toRow, toCol));
                                piecesBox.add(new Pawn(PieceType.Pawn, color, toRow, toCol));
                                piecesBox.remove(movingPiece);
                                Pieces.id[fromRow][fromCol] = null;
                                makPromotion(toRow, toCol, movingPiece);
                                deathIncrement(colorOccupied,squareOccupiedType);
                                if(movingPieceColor=='W')
                                    state=2;
                                else
                                    state=1;
                            }}
                    }
                }
                //REMOVE WHEN ADD others
                case 'Q' -> {
                    if(Queen.isMoveValid(fromRow,fromCol,toRow,toCol,movingPieceColor)){
                        if (squareOccupiedType == ' ') {
                            squares[toRow][toCol].setPiece(new Queen(PieceType.Queen, movingPiece.getColor(), toRow, toCol));
                            squares[fromRow][fromCol].setIcon(null);
                            piecesBox.add(new Queen(PieceType.Queen, movingPiece.getColor(), toRow, toCol));
                            piecesBox.remove(movingPiece);
                            Pieces.id[fromRow][fromCol] = null;
                            if(movingPieceColor=='W')
                                state=2;
                            else
                                state=1;
                        } else {
                            if(!ischeckMate(toRow,toCol,colorOccupied)){
                                piecesBox.remove(isSquareOccupied);
                                squares[toRow][toCol].setIcon(null);
                                squares[fromRow][fromCol].setIcon(null);
                                squares[toRow][toCol].setPiece(new Queen(PieceType.Queen, movingPiece.getColor(), toRow, toCol));
                                piecesBox.add(new Queen(PieceType.Queen, movingPiece.getColor(), toRow, toCol));
                                piecesBox.remove(movingPiece);
                                Pieces.id[fromRow][fromCol] = null;
                                deathIncrement(colorOccupied,squareOccupiedType);
                                if(movingPieceColor=='W')
                                    state=2;
                                else
                                    state=1;
                            }
                        }}}

                case 'N' -> {

                    if(Knight.isMoveValid(fromRow,fromCol,toRow,toCol,movingPieceColor)){
                        if (squareOccupiedType == ' ') {
                            squares[toRow][toCol].setPiece(new Knight(PieceType.Knight, movingPiece.getColor(), toRow, toCol));
                            squares[fromRow][fromCol].setIcon(null);
                            piecesBox.add(new Knight(PieceType.Knight, movingPiece.getColor(), toRow, toCol));
                            piecesBox.remove(movingPiece);
                            Pieces.id[fromRow][fromCol] = null;
                            if(movingPieceColor=='W')
                                state=2;
                            else
                                state=1;
                        } else {
                            if(!ischeckMate(toRow,toCol,colorOccupied)){
                                piecesBox.remove(isSquareOccupied);
                                squares[toRow][toCol].setIcon(null);
                                squares[fromRow][fromCol].setIcon(null);
                                squares[toRow][toCol].setPiece(new Knight(PieceType.Knight, movingPiece.getColor(), toRow, toCol));
                                piecesBox.add(new Knight(PieceType.Knight, movingPiece.getColor(), toRow, toCol));
                                piecesBox.remove(movingPiece);
                                Pieces.id[fromRow][fromCol] = null;
                                deathIncrement(colorOccupied,squareOccupiedType);
                                if(movingPieceColor=='W')
                                    state=2;
                                else
                                    state=1;
                            }}
                    }}

                case 'K' -> {
                    if(King.isMoveValid(fromRow,fromCol,toRow,toCol,movingPieceColor)){
                        if (squareOccupiedType == ' ') {
                            squares[toRow][toCol].setPiece(new King(PieceType.King, movingPiece.getColor(), toRow, toCol));
                            squares[fromRow][fromCol].setIcon(null);
                            piecesBox.add(new King(PieceType.King, movingPiece.getColor(), toRow, toCol));
                            piecesBox.remove(movingPiece);
                            Pieces.id[fromRow][fromCol] = null;
                            if(movingPieceColor=='W')
                                King.firstMoveWK = false;
                            else
                                King.firstMoveBK = false;

                            if(movingPieceColor=='W')
                                state=2;
                            else
                                state=1;
                        }
                        else {
                            if(!ischeckMate(toRow,toCol,colorOccupied)){
                                piecesBox.remove(isSquareOccupied);
                                squares[toRow][toCol].setIcon(null);
                                squares[fromRow][fromCol].setIcon(null);
                                squares[toRow][toCol].setPiece(new King(PieceType.King, movingPiece.getColor(), toRow, toCol));
                                piecesBox.add(new King(PieceType.King, movingPiece.getColor(), toRow, toCol));
                                piecesBox.remove(movingPiece);
                                Pieces.id[fromRow][fromCol] = null;
                                if(movingPieceColor=='W')
                                    King.firstMoveWK = false;
                                else
                                    King.firstMoveBK = false;
                                if(movingPieceColor=='W')
                                    state=2;
                                else
                                    state=1;
                            }}
                    }}
                case 'B' -> {
                    if(Bishop.isMoveValid(fromRow,fromCol,toRow,toCol,movingPieceColor)){
                        if (squareOccupiedType == ' ') {
                            squares[toRow][toCol].setPiece(new Bishop(PieceType.Bishop, movingPiece.getColor(), toRow, toCol));
                            squares[fromRow][fromCol].setIcon(null);
                            piecesBox.add(new Bishop(PieceType.Bishop, movingPiece.getColor(), toRow, toCol));
                            piecesBox.remove(movingPiece);
                            Pieces.id[fromRow][fromCol] = null;
                            if(movingPieceColor=='W')
                                state=2;
                            else
                                state=1;
                        } else {
                            if(!ischeckMate(toRow,toCol,colorOccupied)){
                                piecesBox.remove(isSquareOccupied);
                                squares[toRow][toCol].setIcon(null);
                                squares[fromRow][fromCol].setIcon(null);
                                squares[toRow][toCol].setPiece(new Bishop(PieceType.Bishop, movingPiece.getColor(), toRow, toCol));
                                piecesBox.add(new Bishop(PieceType.Bishop, movingPiece.getColor(), toRow, toCol));
                                piecesBox.remove(movingPiece);
                                Pieces.id[fromRow][fromCol] = null;
                                deathIncrement(colorOccupied,squareOccupiedType);
                                if(movingPieceColor=='W')
                                    state=2;
                                else
                                    state=1;
                            }}
                    }}
                case 'R' -> {
                    if(Rook.isMoveValid(fromRow,fromCol,toRow,toCol,movingPieceColor)){
                        if (squareOccupiedType == ' ') {
                            squares[toRow][toCol].setPiece(new Rook(PieceType.Rook, movingPiece.getColor(), toRow, toCol));
                            squares[fromRow][fromCol].setIcon(null);
                            piecesBox.add(new Rook(PieceType.Rook, movingPiece.getColor(), toRow, toCol));
                            piecesBox.remove(movingPiece);
                            Pieces.id[fromRow][fromCol] = null;
                            if (movingPieceColor == 'W') {
                                if (fromCol == 7)
                                    Rook.firstMoveRWR = false;
                                if (fromCol == 0)
                                    Rook.firstMoveLWR = false;
                            } else{
                                if (fromCol == 7)
                                    Rook.firstMoveRBR = false;
                                if (fromCol == 0)
                                    Rook.firstMoveLBR = false;
                            }

                            if(movingPieceColor=='W')
                                state=2;
                            else
                                state=1;
                        }else {
                            if(!ischeckMate(toRow,toCol,colorOccupied)){
                                piecesBox.remove(isSquareOccupied);
                                squares[toRow][toCol].setIcon(null);
                                squares[fromRow][fromCol].setIcon(null);
                                squares[toRow][toCol].setPiece(new Rook(PieceType.Rook, movingPiece.getColor(), toRow, toCol));
                                piecesBox.add(new Rook(PieceType.Rook, movingPiece.getColor(), toRow, toCol));
                                piecesBox.remove(movingPiece);
                                Pieces.id[fromRow][fromCol] = null;
                                deathIncrement(colorOccupied,squareOccupiedType);
                                if (movingPieceColor == 'W') {
                                    if (fromCol == 7)
                                        Rook.firstMoveRWR = false;
                                    if (fromCol == 0)
                                        Rook.firstMoveLWR = false;
                                } else{
                                    if (fromCol == 7)
                                        Rook.firstMoveRBR = false;
                                    if (fromCol == 0)
                                        Rook.firstMoveLBR = false;
                                }

                                if(movingPieceColor=='W')
                                    state=2;
                                else
                                    state=1;
                            }}}

                }
                default -> {
                    throw new IllegalStateException("Unexpected value: " + movingPieceType);
                }
            }
        }}
    public static void deathIncrement(char color, char type){
        switch (color){
            case 'W'->{
                switch (type){
                    case 'P':{
                        WP++;
                        label1W.setText("x"+WP);
                        break;
                    }
                    case 'Q':{
                        WQ++;
                        label5W.setText("x"+WQ);
                        System.out.println(WQ);
                        break;
                    }
                    case 'R':{
                        WR++;
                        label2W.setText("x"+WR);
                        break;
                    }
                    case 'N':{
                        WN++;
                        label3W.setText("x"+WN);
                        break;
                    }
                    case 'B':{
                        WB++;
                        label4W.setText("x"+WB);
                        break;
                    }
                }
            }
            case 'B'->{
                switch (type){
                    case 'P':{
                        BP++;
                        label1B.setText("x"+BP);
                        break;
                    }
                    case 'Q':{
                        BQ++;
                        label5B.setText("x"+BQ);
                        break;
                    }
                    case 'R':{
                        BR++;
                        label2B.setText("x"+BR);
                        break;
                    }
                    case 'N':{
                        BN++;
                        label3B.setText("x"+BN);
                        break;
                    }
                    case 'B':{
                        BB++;
                        label4B.setText("x"+BB);
                        break;
                    }

                }
            }
        }
    }



    static boolean  ischeckMate(int toRow, int toCol,char color){
        if(Pieces.getId(toRow,toCol).charAt(1)=='K'){
            if(color=='W'){
                winner=2;
                System.out.println("white player won");
                Board.frame.dispose();
                Game_Over_Frame g1 = new Game_Over_Frame();

                return true;
            }
            else{
                winner=1;
                System.out.println("black player won");
                Board.frame.dispose();
                Game_Over_Frame g1 = new Game_Over_Frame();


                return true;}
        }
        else
            return false;
    }


    public static void makPromotion(int toRow, int toCol, Pieces movingPiece){
        if (Pawn.willBePromoted(toRow)){

            JFrame frameP =new JFrame();
            frameP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//good for temporary window
            frameP.setSize(200,200);
            frameP.setResizable(false);
            ImageIcon icon=new ImageIcon("360_F_346775711_wgofOdl8Z4DKi0FR9mBFRo1FK3kmMtC9.jpg");
            frameP.setIconImage(icon.getImage());
            JLabel label=new JLabel();
            label.setText("Choose the piece to pe promoted to:");
            JPanel panel = new JPanel();
            JPanel buttonPanel = new JPanel();
            panel.add(label, BorderLayout.NORTH);
            buttonPanel.setLayout(new GridLayout(1, 4));
            JButton queenButton = new JButton("Queen");
            JButton rookButton = new JButton("Rook");
            JButton bishopButton = new JButton("Bishop");
            JButton knightButton = new JButton("Knight");
            queenButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    squares[toRow][toCol].setPiece(new Queen(PieceType.Queen, movingPiece.getColor(), toRow, toCol));
                    piecesBox.add(new Queen(PieceType.Queen, movingPiece.getColor(), toRow, toCol));
                    frameP.dispose();
                }
            });
            rookButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    squares[toRow][toCol].setPiece(new Rook(PieceType.Rook, movingPiece.getColor(), toRow, toCol));
                    piecesBox.add(new Rook(PieceType.Rook, movingPiece.getColor(), toRow, toCol));
                    frameP.dispose();
                }
            });
            bishopButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    squares[toRow][toCol].setPiece(new Bishop(PieceType.Bishop, movingPiece.getColor(), toRow, toCol));
                    piecesBox.add(new Bishop(PieceType.Bishop, movingPiece.getColor(), toRow, toCol));
                    frameP.dispose();
                }
            });
            knightButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    squares[toRow][toCol].setPiece(new Knight(PieceType.Knight, movingPiece.getColor(), toRow, toCol));
                    piecesBox.add(new Knight(PieceType.Knight, movingPiece.getColor(), toRow, toCol));
                    frameP.dispose();
                }
            });

            buttonPanel.add(queenButton);
            buttonPanel.add(rookButton);
            buttonPanel.add(bishopButton);
            buttonPanel.add(knightButton);
            panel.add(buttonPanel,BorderLayout.CENTER);
            frameP.add(panel);
            frameP.pack();
            frameP.setVisible(true);


        }


    }}