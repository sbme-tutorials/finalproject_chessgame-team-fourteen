package pieces;
import board.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pieces extends Component {
    public Pieces(){

    }
    //attributes

    protected String playerName = "Guest";
    protected int currentRow;
    protected int currentColumn;
    protected boolean isAlive = true;
    protected Image image;
    protected boolean isMoveValid = false;
    protected int playerNum;
    public int targetRow;
    public int targetColoumn;
    protected PieceType pieceType;
    protected ColorPiece color;
    public static String[][] id=new String[8][8];



    // methods
    public Pieces( PieceType pieceType,ColorPiece  color, int currentRow,int currentColumn) {
       // this.playerName = playerName;
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        this.color = color;
      //  this.isAlive = isAlive;
        this.pieceType= pieceType;
        this.id[currentRow][currentColumn]=generateId();
        }
      //  this.image=generateImage();

/*public void setTargetRow(){
int[] x=Board.getTargetRowAndCol(currentRow,currentColumn);
this.targetRow=x[0];
}
public void setTargetColoumn(){
        int[]x=Board.getTargetRowAndCol(currentRow,currentColumn);
        this.targetColoumn=x[1];
}
public int getTargetRow(){
        return this.targetRow;
}
public int getTargetColoumn(){
        return this.targetColoumn;
}*/



    //private to not be access make it safe from errors
    private String generateId(){
        String colorCode,typeCode = " ";
        if (this.color== ColorPiece.White)
            colorCode="W";
         else if(this.color== ColorPiece.Black)
            colorCode="B";
        else
            return "  ";
        switch (this.pieceType){
            case Pawn:
                typeCode="P";
                break;
            case King:
                typeCode="K";
                break;
            case Knight:
                typeCode="N";
                break;
            case Queen:
                typeCode="Q";
                break;
            case Rook:
                typeCode="R";
                break;
            case Bishop:
                typeCode="B";
                break;
            default:
                System.out.println("THERE AN ERROE!!");
                break;
        }
return colorCode + typeCode ;
    }
    public static String getId(int row,int col){
        if (id[row][col]==null)
            return "  ";
        else
return id[row][col];
    }



 /*   private Image generateImage(){

       Image imagg;
        switch (this.pieceType){
            case Pawn:
                imagg="p";
                break;
            case King:
                imagg="K";
                break;
            case Knight:
                imagg="N";
                break;
            case Queen:
                imagg="Q";
                break;
            case Rook:
                imagg="R";
                break;
            case Bishop:
                imagg="B";
                break;
            default:
                System.out.println("THERE AN ERROE!!");
                break;
        }
        return imagg;
    }*/
    public Image getImage(){
        return image;
    }




    public static boolean isMoveValid(int fromRow,int fromCol,int toRow,int toCol) {
        char oc =getId(toRow,toCol).charAt(0);
        char ot=getId(toRow,toCol).charAt(1);
        char mc=getId(fromRow,fromCol).charAt(0);
        char mt=getId(fromRow,fromCol).charAt(1);


        if ( oc=='W'&&mc=='W' ){
    return false;
    } else if (oc=='B'&&mc=='B'){
    return false;}
        else if (oc=='W'&&mc=='B'){

            return true;
        }
        else if (oc=='B'&&mc=='W'){
            return true;}
        else {
            return true;}
    }


    public boolean isAlive() {
        return this.isAlive;
    }

    public ColorPiece getColor() {
        return this.color ;
    }

    public int getCurrentRow() {
        return this.currentRow;
    }

    public int getCurrentColumn() {
        return this.currentColumn;
    }

    public void setColor(ColorPiece color) {
        this.color=color;

    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public void setCurrentColumn(char currentColumn) {
        this.currentColumn = currentColumn;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void calculateLegalMove() {

    }

   /* public void makeMove() {
        if(isMoveValid&&!isCanCapture()){
            calculateLegalMove();
//Board.move(getTargetRow(),getTargetColoumn(),currentRow,currentColumn);
id[targetRow][targetColoumn]=id[currentRow][currentColumn];
id[currentRow][currentColumn]=null;}
        else if(isMoveValid()&&isCanCapture())//redundunt need to add condition in the main
        {
            calculateLegalMove();

        //    Board.move(this.currentRow, this.currentColumn, this.targetRow,this.targetColoumn);
            id[targetRow][targetColoumn]= id[currentRow][currentColumn];
            id[currentRow][currentColumn]=null;
            //set is alive false for this piece
            //need to be add in main
        }*/





    /*public boolean isCanCapture(){
        if (isMoveValid()&&id[this.targetRow][this.targetColoumn]!=null)
            return true;
        else return false;

    }*/

    public String getPath(ColorPiece color) {
        return null;
    }
    public void setType(PieceType pieceType){
        this.pieceType=pieceType;
    }
    public  String getType()
    {
        return this.pieceType.name();

    }
    public void setLocation(int currentRow,int currentColumn)
    {
        this.currentRow=currentRow;
        this.currentColumn=currentColumn;
    }


}
