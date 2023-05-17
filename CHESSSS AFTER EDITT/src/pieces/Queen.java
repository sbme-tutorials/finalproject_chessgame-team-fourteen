package pieces;
import board.*;
import org.w3c.dom.ls.LSOutput;

public class Queen extends Pieces {
    public Queen(PieceType pieceType, ColorPiece color, int currentRow, int currentColumn) {
        super(pieceType, color, currentRow, currentColumn);
    }


    public static boolean isMoveValid(int fromRow, int fromCol, int toRow, int toCol, char color) {
        int row = Math.abs(fromRow - toRow);
        int col = Math.abs(fromCol - toCol);
        boolean found = false;

        if ((fromRow == toRow) && (toCol > fromCol)) {
            for (int i = fromCol + 1; i < toCol; i++) {
                if (getId(toRow, i) != "  ") {
                    found = true;
                }
                if (found) return false;
            }
            return true;
        }

        if ((fromRow == toRow) && (toCol < fromCol)) {
            for (int i = fromCol - 1; i > toCol; i--) {
                if (getId(toRow, i) != "  ") {
                    found = true;
                }
                if (found) return false;
            }
            return true;
        }

        if ((fromCol == toCol) && (toRow > fromRow)) {
            for (int i = fromRow + 1; i < toRow; i++) {
                if (getId(i, toCol) != "  ") {
                    found = true;
                }
                if (found) return false;
            }
            return true;
        }

        if ((fromCol == toCol) && (toRow < fromRow)) {
            for (int i = fromRow - 1; i > toRow; i--) {
                if (getId(i, toCol) != "  ") {
                    found = true;
                }
                if (found) return false;
            }
            return true;
        }

        if ((row <= 7) && (col <= 7) && row == col) return true;

        return false;
    }



    @Override
    public String getPath(ColorPiece color) {
        return color==ColorPiece.White? "src/pieces/assets/white/WhiteQueen.png" : "src/pieces/assets/black/BlackQueen.png";
    }


}
