package pieces;

/**
 * {@code Rook} class represents the Rook piece in chess.
 * It is a subclass to {@code ChessPieces} and also has a specific castling status.
 * This class has an override for the abstract {@code getSymbol()} method in {@code ChessPieces} to return a symbolic representation of the piece.
 */
public class Rook extends ChessPiece {

    /**
     * Constructs a Rook piece with the specified color.
     *
     * @param color the color of the Rook, either "white" or "black"
     */
    public Rook(String color) {
        super(color);
    }

    public boolean validMove(int startRow, int startCol, int endRow, int endCol) {
        // Implement Rook-specific move validation logic here
        boolean valid = true;
        if(startRow != endRow && startCol != endCol){
            valid = false; // Rooks can only move in straight lines
        }
        return valid;
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2656" : "\u265C"; // Unicode for white and black Rook
    }
}