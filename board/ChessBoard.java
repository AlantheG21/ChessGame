package board;

import javax.swing.*;
import java.awt.*;
import chessGame.ChessGame;
import position.*;
import pieces.*;

/**
 * Creates an 8x8 chess board with all the chess pieces.
 * The board is initialized with the standard starting positions of all pieces
 * for both white and black players. Provides methods to get the current
 * board state, retrieve a specific position, and reset the board.
 */
public class ChessBoard extends JPanel {
    private ChessGame chessGame;
    private final JPanel[][] boardPanel = new JPanel[8][8];

    /**
     * Constructs a new chess board and initializes all the pieces in their starting positions.
     */
    public ChessBoard() {
        chessGame = new ChessGame();
        setLayout(new GridLayout(8, 8));
        setPreferredSize(new Dimension(400, 400));

        buildBoard();
    }

    /**
     * Resets the board by reassigning pieces to their original starting positions.
     * Currently only resets some of the board and not all of it, and needs further implementation.
     */
    public void resetBoard() {
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

    private void buildBoard(){
        Color lightColor = new Color(216, 216, 216);
        Color darkColor = new Color(129,129,129);
        for(int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                
                Position position = chessGame.getPosition(row,col);
                JPanel square = new PositionPanel(position.toString());
                square.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                square.setBackground((row + col) % 2 == 0 ? lightColor : darkColor);
                boardPanel[row][col] = square;
                add(square);
            }
        }
    }
}