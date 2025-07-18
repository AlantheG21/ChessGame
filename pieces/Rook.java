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

    /**
     * Returns the symbol representing the Rook.
     *
     * @return "R", the symbol for Rook
     */
    @Override
    public String getSymbol() {
        return "R";
    }

}