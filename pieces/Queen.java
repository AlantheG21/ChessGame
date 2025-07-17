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

    /**
     * Returns the symbol representing the Queen.
     *
     * @return "Q", the symbol for Queen
     */
    @Override
    public String getSymbol() {
        return "Q";
    }

}