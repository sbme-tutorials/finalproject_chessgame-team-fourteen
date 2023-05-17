package pieces;
import board.Square;
import frames.*;
import pieces.*;
import static board.Board.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static board.Board.piecesBox;
import static board.Board.squares;

public class Pawn extends Pieces{
    static char piececolor;
    public Pawn(){

    }
   private boolean canCapture=false;
   private boolean canBePromoted=false;
   private boolean isFirstMove=false;
   private int nump;
   private static int numOfMove=0;


public Pawn(PieceType pieceType,ColorPiece color,int currentColumn,int currentRow)
{
    super(pieceType,color,currentColumn,currentRow);
}


    static Button[][] squares = new Button[8][8];//need to be edited to take this value from buttons made in main frame of game
    public static boolean isFirstMove(int fromRow,char color){
      if((fromRow==1&&color=='B')||(fromRow==6&&color=='W'))
          return true;
      else
          return false;
    }

   public static boolean isMoveValid(int fromRow, int fromCol, int toRow, int toCol,char color) {

       //  piececolor=  Board. isturn(Board.firstplayer);
         switch (color) {
             case 'B': {
                 if (toRow - fromRow == 1 && toCol - fromCol == 0) {

                     return true;//move forward
                 } else if (toRow - fromRow == 1 && Math.abs(toCol - fromCol) == 1) //move diagonally if it will eat
                 {
                     if (id[toRow][toCol] != null) {
                         return true;

                     } else return false;

                 } else if (isFirstMove(fromRow, color) && toRow - fromRow == 2 && toCol - fromCol == 0) {
                     return true;
                 } else {

                     return false;

                 }


             }
             case 'W': {
                 if (toRow - fromRow == -1 && toCol - fromCol == 0) {

                     return true;//move forward
                 } else if (toRow - fromRow == -1 && Math.abs(toCol - fromCol) == 1) //move diagonally if it will eat
                 {
                     if (id[toRow][toCol] != null) {
                         return true;

                     } else return false;

                 } else if (isFirstMove(fromRow, color) && toRow - fromRow == -2 && toCol - fromCol == 0) {
                     return true;
                 } else {

                     return false;

                 }


             }


         }
        return false;
   }
public static boolean willBePromoted(int toRow){
if (toRow==7||toRow==0)
    return true;
else
    return false;
}


    @Override
    public String getPath(ColorPiece color) {
        return color==ColorPiece.White? "src/pieces/assets/white/WhitePawn.png" : "src/pieces/assets/black/BlackPawn.png";
    }



    }
