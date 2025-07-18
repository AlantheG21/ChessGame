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

    /**
     * Returns the symbol representing the Knight.
     *
     * @return "N", the symbol for Knight
     */
    @Override
    public String getSymbol() {
        return "N";
    }

}