import board.ChessBoard;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * Main method for the Chess game.
 * This class initializes the board and allows the user to enter moves.
 * Currently supports move input parsing and displays the board.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        ChessBoard chessBoard = new ChessBoard();
        frame.add(chessBoard.printBoard());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
