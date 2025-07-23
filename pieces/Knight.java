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

    public String getUnicode() {
        return getColor().equals("white") ? "\u2658" : "\u265E"; // Unicode for white and black Knight
    }
}