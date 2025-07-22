package position;

import pieces.ChessPiece;
import javax.swing.*;

/**
 * Represents a position on the chess board.
 * Each position stores its coordinates (x, y) and the {@code ChessPieces} object occupying it.
 * Coordinates follow a 0-indexed system (0–7 for both rows and columns).
 * Overrides {@code toString()} for board display logic.
 */
public class Position {
    private ChessPiece chess_piece;
    private int x;
    private int y;
    private JPanel panelSquare;

    /**
     * Constructs a position on the board with specified coordinates and a chess piece.
     *
     * @param x           the row index of the position (0–7)
     * @param y           the column index of the position (0–7)
     * @param chess_piece the chess piece at this position (can be {@code null})
     */
    public Position(int x, int y, ChessPiece chess_piece) {
        this.setPiece(chess_piece);
        this.setX(x);
        this.setY(y);
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

    public void setPiece(ChessPiece p) {
        // set piece on the board
        this.chess_piece = p;
    }

    /**
     * Returns the x-coordinate (row) of this position.
     *
     * @return the row index
     */
    public int getX() {
        // get X coordinate
        return this.x;
    }

    /**
     * Sets the x-coordinate (row) of this position.
     *
     * @param x the row index to set
     */
    public void setX(int x) {
        // set X coordinate
        this.x = x;
    }

    /**
     * Returns the y-coordinate (column) of this position.
     *
     * @return the column index
     */
    public int getY() {
        // get Y coordinate
        return this.y;
    }

    /**
     * Sets the y-coordinate (column) of this position.
     *
     * @param y the column index to set
     */
    public void setY(int y) {
        // set Y coordinate
        this.y = y;
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

    public void setPosition(java.awt.Color color) {
        String emptySquare = "";
        JLabel square = new JLabel(chess_piece != null ? chess_piece.getUnicode() : emptySquare);
        square.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 24));
        square.setHorizontalAlignment(JLabel.CENTER);
        square.setVerticalAlignment(JLabel.CENTER);

        panelSquare = new JPanel(new java.awt.BorderLayout());
        panelSquare.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
        
        panelSquare.setBackground(color);
        panelSquare.add(square);

        //return panelSquare;
    }

    public JPanel getPosition(){
        return panelSquare;
    }
}