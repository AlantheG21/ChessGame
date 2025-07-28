package pieces;

/**
 * {@code Queen} class represents the Queen piece in chess.
 * It is a subclass to {@code ChessPieces} and also has a specific castling status.
 * This class has an override for the abstract {@code getSymbol()} method in {@code ChessPieces} to return a symbolic representation of the piece.
 */
public class Queen extends ChessPiece {

    /**
     * Constructs a Queen piece with the specified color.
     *
     * @param color the color of the Queen, either "white" or "black"
     */
    public Queen(String color) {
        super(color);
    }

    public boolean validMove(int startRow, int startCol, int endRow, int endCol) {
        // Implement Queen-specific move validation logic here
        boolean valid = false;
        int rowDiff = Math.abs(startRow - endRow);
        int colDiff = Math.abs(startCol - endCol);
        
        // Queens can move any number of squares along a row, column, or diagonal
        if (rowDiff == 0 || colDiff == 0 || rowDiff == colDiff) {
            valid = true;
        }
        
        return valid;
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2655" : "\u265B"; // Unicode for white and black Queen
    }
}