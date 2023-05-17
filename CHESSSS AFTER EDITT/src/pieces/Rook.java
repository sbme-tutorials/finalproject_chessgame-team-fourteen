package pieces;

public class Rook  extends Pieces{
    public static boolean  firstMoveRWR = true;
    public static boolean  firstMoveLWR = true;
    public static boolean  firstMoveRBR = true;
    public static boolean  firstMoveLBR = true;

    public Rook( PieceType pieceType,ColorPiece color,int currentRow,int currentColumn) {
        super(pieceType,color,currentRow,currentColumn);
    }
    public static boolean isMoveValid(int fromRow, int fromCol, int toRow, int toCol, char color) {
        int row = Math.abs(fromRow - toRow);
        int col = Math.abs(fromCol - toCol);
        boolean found = false;

        if ((fromRow == toRow) && (toCol> fromCol)){
            for( int i = fromCol+1; i< toCol; i++) {
                if (getId(toRow, i) != "  ") {
                    found = true;
                }
                if (found)  return false;
                //if(((King.castle().equals("ValidRightWRook") && toCol == fromCol+2 && Pieces.getId(fromRow, fromCol).charAt(0) == 'W')) ||( (King.castle().equals("ValidLeftWRook") && toCol == fromCol-2)  && Pieces.getId(fromRow, fromCol).charAt(0) == 'W') || ((King.castle().equals("ValidRightBRook") && toCol == fromCol+2) && Pieces.getId(fromRow, fromCol).charAt(0) == 'B') || ((King.castle().equals("ValidLeftBRook") && toCol == fromCol-2))  && Pieces.getId(fromRow, fromCol).charAt(0) == 'B')
                return true;


            }
            return true;}

        if ((fromRow == toRow) && (toCol< fromCol)){
            for( int i = fromCol-1;i>toCol;i--) {
                if (getId(toRow, i) != "  ") {
                    found = true;
                }
                if (found )
                    return false;
                //if(((King.castle().equals("ValidRightWRook") && toCol == fromCol+2 && Pieces.getId(fromRow, fromCol).charAt(0) == 'W')) ||( (King.castle().equals("ValidLeftWRook") && toCol == fromCol-2)  && Pieces.getId(fromRow, fromCol).charAt(0) == 'W') || ((King.castle().equals("ValidRightBRook") && toCol == fromCol+2) && Pieces.getId(fromRow, fromCol).charAt(0) == 'B') || ((King.castle().equals("ValidLeftBRook") && toCol == fromCol-2))  && Pieces.getId(fromRow, fromCol).charAt(0) == 'B')                    return true;

            }
            return true;}

        if ((fromCol == toCol) && (toRow > fromRow)){
            for(int i = fromRow+1; i<toRow; i++) {
                if (getId(i, toCol) != "  ") {
                    found = true;
                }
                if (found) return false;
            }
            return true;}

        if ((fromCol == toCol) && (toRow < fromRow)){
            for(int i=fromRow-1;i>toRow;i--){
                if(getId(i,toCol)!= "  "){ found = true;}
                if(found) return false;
            }
            return true;}


        return false;
    }

    @Override
    public String getPath(ColorPiece color) {
        return color==ColorPiece.White? "src/pieces/assets/white/WhiteRook.png" : "src/pieces/assets/black/BlackRook.png";
    }
}