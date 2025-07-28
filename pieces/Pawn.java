package pieces;

/**
 * {@code Pawn} class represents the Pawn piece in chess.
 * It is a subclass to {@code ChessPieces} and also has a specific castling status.
 * This class has an override for the abstract {@code getSymbol()} method in {@code ChessPieces} to return a symbolic representation of the piece.
 */
public class Pawn extends ChessPiece {

    /**
     * Constructs a Pawn piece with the specified color.
     *
     * @param color the color of the Pawn, either "white" or "black"
     */
    public Pawn(String color) {
        super(color);
    }

    public boolean validMove(int startRow, int startCol, int endRow, int endCol) {
        // Implement Pawn-specific move validation logic here
        boolean valid = true;
        int rowDiff = Math.abs(startRow - endRow);
        if(startCol != endCol){
            valid = false; // Pawns can only move forward in the same column
        }

        if(rowDiff > 1){
            valid = false; // Pawns can only move one square forward
        }
        return valid;
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2659" : "\u265F"; // Unicode for white and black Pawn
    }
}