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
        int choice = -1;

        // Loop until a valid choice is made. Valid choices are 0 or 1.
        while(true){
            if(scnr.hasNextInt()) {
                choice = scnr.nextInt();
            }
            if(choice < 0 || choice > 1){
                System.out.println("Invalid input. Please enter 0 or 1.");
                scnr.nextLine(); // Clear the invalid input
                System.out.print("Selection: ");
            }
            else break; // Valid input
        }
        scnr.nextLine(); // Clear the newline character after nextInt()

        // Process the choice
        switch (choice) {
            case 0:
                System.out.println("Exitting Program");
                break;
            case 1:
                ChessBoard board = new ChessBoard(); // create the board
                board.printBoard(); // print the board
                String move;
                do{
                    System.out.println("Enter your move (e.g. E2 E4) or type 'exit' to quit:");
                    move = scnr.nextLine().trim();
                    if (move.matches("[A-H][1-8] [A-H][1-8]")) { //Validate move
                        System.out.println("You entered: " + move);
                        // Here you would typically update the chessboard state
                    } 
                    else {
                        while(!move.equalsIgnoreCase("exit") && !move.matches("[A-H][1-8] [A-H][1-8]")) {
                            System.out.println("Invalid move format.");
                            System.out.println("Please enter a valid move (e.g. E2 E4) or type 'exit' to quit:");
                            move = scnr.nextLine().trim();
                        }
                        if(!move.equals("exit")) System.out.println("You entered: " + move);
                    }
                    if(!move.equals("exit")) board.printBoard(); // print the board only if a new move was made
                }while(!move.equalsIgnoreCase("exit"));

                break;
        }

        scnr.close();
    }
}
