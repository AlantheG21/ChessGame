package pieces;

/**
 * {@code Knight} class represents the Knight piece in chess.
 * It is a subclass to {@code ChessPieces} and also has a specific castling status.
 * This class has an override for the abstract {@code getSymbol()} method in {@code ChessPieces} to return a symbolic representation of the piece.
 */
public class Knight extends ChessPiece {

    /**
     * Constructs a Knight piece with the specified color.
     *
     * @param color the color of the Knight, either "white" or "black"
     */
    public Knight(String color) {
        super(color);
    }

    public boolean validMove(int startRow, int startCol, int endRow, int endCol) {
        // Implement Knight-specific move validation logic here
        boolean valid = false;
        int rowDiff = Math.abs(startRow - endRow);
        int colDiff = Math.abs(startCol - endCol);
        
        // Knights move in an "L" shape: two squares in one direction and one square perpendicular
        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            valid = true;
        }
        
        return valid;
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2658" : "\u265E"; // Unicode for white and black Knight
    }
}