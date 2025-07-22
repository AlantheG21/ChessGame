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

    /**
     * Returns the symbol representing the Pawn.
     *
     * @return "P", the symbol for Pawn
     */
    @Override
    public String getSymbol() {
        return "P";
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2659" : "\u265F"; // Unicode for white and black Pawn
    }
}