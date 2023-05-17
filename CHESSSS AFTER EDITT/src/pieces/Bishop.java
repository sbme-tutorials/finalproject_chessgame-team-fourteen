package pieces;
import board.*;
public class Bishop extends Pieces{
    public Bishop( PieceType pieceType,ColorPiece color,int currentRow,int currentColumn) {
        super(pieceType,color,currentRow,currentColumn);
    }
    public static boolean isMoveValid(int fromRow, int fromCol, int toRow, int toCol, char color) {
        int row = Math.abs(fromRow - toRow);
        int col = Math.abs(fromCol - toCol);

        if ((row <= 3 && col <= 3) && (row == col) && (row>0) || (row == 0 && col == 1)){return true;}
        else {return false;}

    }
    @Override
    public  String getPath(ColorPiece color) {
        return color==ColorPiece.White? "src/pieces/assets/white/WhiteBishop.png" :"src/pieces/assets/black/BlackBishop.png";
    }
}
