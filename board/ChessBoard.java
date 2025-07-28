package board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import chessGame.ChessGame;
import position.*;

/**
 * Creates an 8x8 chess board with all the chess pieces.
 * The board is initialized with the standard starting positions of all pieces
 * for both white and black players. Provides methods to get the current
 * board state, retrieve a specific position, and reset the board.
 */
public class ChessBoard extends JPanel implements MouseListener{
    private ChessGame chessGame;
    private final PositionPanel[][] boardPanel = new PositionPanel[8][8];
    private Position selectedPiece = null;
    Color lightColor = new Color(216, 216, 216);
    Color darkColor = new Color(129,129,129);

    /**
     * Constructs a new chess board and initializes all the pieces in their starting positions.
     */
    public ChessBoard() {
        chessGame = new ChessGame();
        setLayout(new GridLayout(8, 8));
        setPreferredSize(new Dimension(500, 500));

        buildBoard();
    }

    /**
     * Resets the board by reassigning pieces to their original starting positions.
     * Currently only resets some of the board and not all of it, and needs further implementation.
     */
    public void resetBoard() {
        chessGame.resetBoard();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Position position = chessGame.getPosition(row, col);
                boardPanel[row][col].setLabel(position.toString());
                boardPanel[row][col].setBackground((row + col) % 2 == 0 ? lightColor : darkColor);
            }
        }
        selectedPiece = null; // Reset selected piece
    }

    private void buildBoard(){
        for(int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                Position position = chessGame.getPosition(row,col);
                PositionPanel square = new PositionPanel(position.toString(), row, col);
                square.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                square.setBackground((row + col) % 2 == 0 ? lightColor : darkColor);
                square.addClickListener(this); // Add mouse listener for click events
                boardPanel[row][col] = square;
                add(square);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        PositionPanel clickedPanel = (PositionPanel) e.getSource();

        int row = clickedPanel.getRow();
        int col = clickedPanel.getCol();

        

        if(selectedPiece == null) {
            selectedPiece = chessGame.getPosition(row, col);
            clickedPanel.setBackground(Color.YELLOW);
        } 

        
        else if(selectedPiece.getRow() == row && selectedPiece.getCol() == col) {
            // Deselect the piece if the same square is clicked
            clickedPanel.setBackground((row + col) % 2 == 0 ? lightColor : darkColor);
            selectedPiece = null;
        }

        else {
            // Move the piece to the new position
            Position targetPosition = chessGame.getPosition(row, col);
            PositionPanel targetPanel = boardPanel[row][col];

            if(targetPosition.getPiece() == null) {
                move(targetPosition, targetPanel, row, col);
                return;
            }

            if(targetPosition.getPiece().getColor() == selectedPiece.getPiece().getColor() && selectedPiece.getPiece().validMove(selectedPiece.getRow(), selectedPiece.getCol(), row, col)) {
                JOptionPane.showMessageDialog(this, "Cannot move here, position already occupied by " + targetPosition.getPiece().getColor() + " " + targetPosition.toString());
            }

            else if(targetPosition.toString() == "\u2654" || targetPosition.toString() == "\u265A") {
                JOptionPane.showMessageDialog(this,"King captured by " + selectedPiece.getPiece().getColor() + ". Game over!");
                System.exit(0);
            }
            else{
                // Capture the piece
                move(targetPosition, targetPanel, row, col);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}