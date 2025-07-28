package pieces;

/**
 * {@code King} class represents the king piece in chess.
 * It is a subclass to {@code ChessPieces} and also has a specific castling status.
 * This class has an override for the abstract {@code getSymbol()} method in {@code ChessPieces} to return a symbolic representation of the piece.
 */
public class King extends ChessPiece {
    private boolean CastlingDone = false;

    /**
     * Constructs a King piece with the specified color.
     *
     * @param color the color of the King, either "white" or "black"
     */
    public King(String color) {
        super(color);
    }

    public boolean validMove(int startRow, int startCol, int endRow, int endCol) {
        // Implement King-specific move validation logic here
        boolean valid = false;
        int rowDiff = Math.abs(startRow - endRow);
        int colDiff = Math.abs(startCol - endCol);
        
        // Kings can move one square in any direction
        if ((rowDiff <= 1 && colDiff <= 1) && (rowDiff + colDiff > 0)) {
            valid = true;
        }
        
        return valid;
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2654" : "\u265A"; // Unicode for white and black King
    }
}
