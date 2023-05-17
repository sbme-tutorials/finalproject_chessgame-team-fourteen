package pieces;

import board.*;
public class Knight extends Pieces{
    public Knight( PieceType pieceType,ColorPiece color,int currentRow,int currentColumn) {
        super(pieceType,color,currentRow,currentColumn);
    }
    public static boolean isMoveValid(int fromRow, int fromCol, int toRow, int toCol, char color) {
        int row = Math.abs(fromRow - toRow);
        int col = Math.abs(fromCol - toCol);

        if ((row == 2 && col == 3) || (row == 3 && col == 2)) {return true;}
        else {return false;}

    }

    @Override
    public String getPath(ColorPiece color) {
        return color==ColorPiece.White?  "src/pieces/assets/white/WhiteKnight.png" : "src/pieces/assets/black/BlackKnight.png";
    }
}
