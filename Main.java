import board.ChessBoard;
import pieces.ChessPiece;

import java.util.Scanner;

import position.Position;

/**
 * Main method for the Chess game.
 * This class initializes the board and allows the user to enter moves.
 * Currently supports move input parsing and displays the board.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter 1 to play \nEnter 0 to quit\nSelection:");
        int choice = scnr.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Exitting Program");
                break;
            case 1:
                ChessBoard board = new ChessBoard(); // create the board
                Position[][] current_position = board.getBoard(); // get the 2D matrix

                System.out.println("  A  B  C  D  E  F  G  H"); //Printing the label for the top axis
                for (int i = 0; i < 8; i++) {
                    System.out.print((8 - i) + " ");    // Looping through and print the label for the row and then
                    for (int j = 0; j < 8; j++) {       // each piece in that row otherwise ##
                        System.out.print(current_position[i][j].toString() + " ");
                    }
                    System.out.println();
                }
                String move = "";
                boolean ValidMove = false;  // While loop variable
                while (!ValidMove) {
                    System.out.println("Enter your move (e.g. E2 E4) or type 'exit' to quit:");
                    scnr.nextLine();    // Clear buffer
                    move = scnr.nextLine().trim();
                    while (!move.equalsIgnoreCase("exit")) {
                        if (move.matches("[A-H][1-8] [A-H][1-8]")) {
                            // Process the move
                            System.out.println("You entered: " + move);
                            // Here you would typically update the chessboard state and display it
                        } else {
                            System.out.println("Invalid move format");
                        }
                        System.out.println("Enter your move (or type 'exit' to quit):");
                        move = scnr.nextLine().trim();
                    }
                    break;
                }

        }

        scnr.close();
    }
}
