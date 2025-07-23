package pieces;

/**
 * {@code Bishop} class represents the king piece in chess.
 * It is a subclass to {@code ChessPieces} and also has a specific castling status.
 * This class has an override for the abstract {@code getSymbol()} method in {@code ChessPieces} to return a symbolic representation of the piece.
 */
public class Bishop extends ChessPiece {

    /**
     * Constructs a Bishop piece with the specified color.
     *
     * @param color the color of the Bishop, either "white" or "black"
     */
    public Bishop(String color) {
        super(color);
    }

    public String getUnicode() {
        return getColor().equals("white") ? "\u2657" : "\u265D"; // Unicode for white and black Bishop
    }
}

