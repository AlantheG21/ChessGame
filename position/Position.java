package position;

import pieces.ChessPiece;

/**
 * Represents a position on the chess board.
 * Each position stores its coordinates (x, y) and the {@code ChessPieces} object occupying it.
 * Coordinates follow a 0-indexed system (0–7 for both rows and columns).
 * Overrides {@code toString()} for board display logic.
 */
public class Position {
    private ChessPiece chess_piece;
    private int row;
    private int col;
    private String color;

    /**
     * Constructs a position on the board with specified coordinates and a chess piece.
     *
     * @param row           the row index of the position (0–7)
     * @param col           the column index of the position (0–7)
     * @param chess_piece the chess piece at this position (can be {@code null})
     */
    public Position(int row, int col, ChessPiece chess_piece, String color) {
        this.setPiece(chess_piece);
        this.setColor(color);
        this.setRow(row);
        this.setCol(col);
    }

    /**
     * Returns the chess piece at this position.
     *
     * @return the chess piece, or {@code null} if the square is empty
     */
    public ChessPiece getPiece() {
        // get the piece type
        return this.chess_piece;
    }

    /**
     * Sets the chess piece at this position.
     *
     * @param p the chess piece to place on this square
     */

    public void setPiece(ChessPiece piece) {
        // set piece on the board
        this.chess_piece = piece;
    }

    /**
     * Returns the x-coordinate (row) of this position.
     *
     * @return the row index
     */
    public int getRow() {
        // get X coordinate
        return this.row;
    }

    /**
     * Sets the x-coordinate (row) of this position.
     *
     * @param row the row index to set
     */
    public void setRow(int row) {
        // set X coordinate
        this.row = row;
    }

    /**
     * Returns the y-coordinate (column) of this position.
     *
     * @return the column index
     */
    public int getCol() {
        // get Y coordinate
        return this.col;
    }

    /**
     * Sets the y-coordinate (column) of this position.
     *
     * @param col the column index to set
     */
    public void setCol(int col) {
        // set Y coordinate
        this.col = col;
    }

    private String setColor(String color) {
        this.color = color;
        return this.color;
    }

    public String getColor() {
        return this.color;
    }

    /**
     * Returns a string of this position for board display.
     * If no piece is present, returns "##". Otherwise it returns the piece's string.
     *
     * @return a formatted string for display
     */
    @Override
    public String toString() {
        return (chess_piece == null) ? "##" : chess_piece.toString();
    }
}