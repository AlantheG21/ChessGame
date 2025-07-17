package board;

import position.Position;
import pieces.ChessPiece;
import pieces.Rook;
import pieces.Knight;
import pieces.Bishop;
import pieces.Pawn;
import pieces.Queen;
import pieces.King;

/**
 * Creates an 8x8 chess board with all the chess pieces.
 * The board is initialized with the standard starting positions of all pieces
 * for both white and black players. Provides methods to get the current
 * board state, retrieve a specific position, and reset the board.
 */
public class ChessBoard {
    /**
     * A 2D maxtrix representing the current positions on the chess board.
     */
    Position[][] board;
    /**
     * A chess piece reference (Plans to use this later when a utility package is needed).
     */
    ChessPiece pieces;

    /**
     * Constructs a new chess board and initializes all the pieces in their starting positions.
     */
    public ChessBoard() {
        board = new Position[8][8];

        String white = "white";
        String black = "black";
        // Fill all positions as empty first
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                board[i][j] = new Position(i, j, null);

        // White Pieces
        board[0][0].setPiece(new Rook(white));
        board[0][1].setPiece(new Knight(white));
        board[0][2].setPiece(new Bishop(white));
        board[0][3].setPiece(new Queen(white));
        board[0][4].setPiece(new King(white));
        board[0][5].setPiece(new Bishop(white));
        board[0][6].setPiece(new Knight(white));
        board[0][7].setPiece(new Rook(white));
        for (int j = 0; j < 8; j++) // Loop to set all the white pawns
            board[1][j].setPiece(new Pawn(white));

        // Black Pieces
        board[7][0].setPiece(new Rook(black));
        board[7][1].setPiece(new Knight(black));
        board[7][2].setPiece(new Bishop(black));
        board[7][3].setPiece(new Queen(black));
        board[7][4].setPiece(new King(black));
        board[7][5].setPiece(new Bishop(black));
        board[7][6].setPiece(new Knight(black));
        board[7][7].setPiece(new Rook(black));
        for (int j = 0; j < 8; j++) // Loop to set all the black pawns
            board[6][j].setPiece(new Pawn(black));
    }

    /**
     * Returns the current state of the chess board.
     *
     * @return a 2D matrix of {@code Position} objects representing the board
     */
    public Position[][] getBoard() {
        return board;
    }

    /**
     * Retrieves the {@code Position} object at the given coordinates on the board.
     *
     * @param x the row index (0-7)
     * @param y the column index (0-7)
     * @return the {@code Position} at the specified coordinates
     */
    public Position getPosition(int x, int y) {
        return board[x][y];
    }

    /**
     * Resets the board by reassigning pieces to their original starting positions.
     * Currently only resets some of the board and not all of it, and needs further implementation.
     */
    public void resetBoard() {
        String white = "white";
        String black = "black";

        // White Pieces
        board[0][0] = new Position(0, 0, new Rook(white));
        board[0][1] = new Position(0, 1, new Knight(white));
        board[0][2] = new Position(0, 2, new Bishop(white));
        board[1][0] = new Position(1, 0, new Pawn(white));
        board[1][1] = new Position(1, 1, new Pawn(white));

        // Black Pieces
        board[7][0] = new Position(7, 0, new Rook(black));
        board[7][1] = new Position(7, 1, new Knight(black));
        board[7][2] = new Position(7, 2, new Bishop(black));
        board[6][0] = new Position(6, 0, new Pawn(black));
        board[6][1] = new Position(6, 1, new Pawn(black));
        /*
         * WHITE PAWNS
         *      pawn 1: 1, 0
         *      pawn 2: 1, 1
         *      pawn 3: 1, 2
         *      pawn 4: 1, 3
         *      pawn 5: 1, 4
         *      pawn 6: 1, 5
         *      pawn 7: 1, 6
         *      pawn 8: 1, 7
         */

        /*
         * BLACK PAWNS
         *      pawn 1: 2, 0
         *      pawn 2: 2, 1
         *      pawn 3: 2, 2
         *      pawn 4: 2, 3
         *      pawn 5: 2, 4
         *      pawn 6: 2, 5
         *      pawn 7: 2, 6
         *      pawn 8: 2, 7
         */

        /*
         * BISHOPS
         *      WHITE bishops:
         *          bishop 1: 0, 2
         *          bishop 2: 0, 5
         *
         *      BLACK bishops:
         *          bishop 1: 7, 2
         *          bishop 2: 7, 5
         */

        /*
         * KNIGHTS
         *      WHITE knights:
         *          knight 1: 0, 1
         *          knight 2: 0, 6
         *
         *      BLACK knights:
         *          knight 1: 7, 1
         *          knight 2: 7, 6
         */

        /*
         * ROOKS
         *      WHITE rooks:
         *          rook 1: 0, 0
         *          root 2: 0, 7
         *
         *      BLACK rooks:
         *          rook 1: 7, 0
         *          rook 2: 7, 7
         */

        /*
         * QUEENS
         *      WHITE queen starts: 0, 3
         *      BLACK queen starts: 7, 3
         */

        /*
         * KINGS
         *      WHITE king starts: 0, 4
         *      BLACK king starts: 7, 4
         */
    }

    public void printBoard() {
        System.out.println("  A  B  C  D  E  F  G  H"); // Printing the label for the top axis
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " "); // Looping through and print the label for the row
            for (int j = 0; j < 8; j++) { // each piece in that row otherwise ##
                System.out.print(board[i][j].toString() + " ");
            }
            System.out.println();
        }
    }
}