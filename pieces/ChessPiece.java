package pieces;

//import position.Position;

/**
 * Abstract base class for all chess pieces.
 * Each chess piece has a color and must provide its own symbolic representation.
 * Subclasses ({@code Queen}, {@code King}, {@code Knight}, {@code Rook}, {@code Pawn})
 * must implement the {@code getSymbol()} method.
 * <p>
 * This class overrides {@code toString()} to return a short string combining color and piece symbol for displaying.
 */
public abstract class ChessPiece {
    private String color;   /** Color of the chess piece which is either "white" or "black" */

    /**
     * Constructs a chess piece with its specific color.
     *
     * @param color the color of the chess piece is either "white" or "black".
     */
    public ChessPiece(String color) {
        this.color = color;
    }

    /**
     * Returns the color of the chess piece.
     *
     * @return The color as a string
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns a string combining the characters of "w" or "b" for its color and its character symbol to depict
     * the piece to create a distinguishable tag for each white and black piece.
     *
     * @return String representation of the piece and its color
     */
    @Override
    public String toString() {
        return (color.equals("white") ? "w" : "b") + getUnicode();
    }

    /**
     * Returns a string which contains a character which represents the piece.
     *
     * @return The symbol as a string
     */
    public abstract String getSymbol();
    public abstract String getUnicode();
}