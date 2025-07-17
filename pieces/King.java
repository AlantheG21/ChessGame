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


    /**
     * Returns the symbol representing the King.
     *
     * @return "K", the symbol for King
     */
    @Override
    public String getSymbol() {
        return "K";
    }
}
