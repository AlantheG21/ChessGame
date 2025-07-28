package chessGame;

import pieces.*;
import position.Position;

public class ChessGame {
    private Position board[][] = new Position[8][8];

    public ChessGame() {
        initializeBoard();
    }

    public Position getPosition(int row, int col){
        return board[row][col];
    }

    public void resetBoard() {
        initializeBoard();
    }

    private void initializeBoard(){
        for(int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if(row == 0 || row == 7){
                    board[row][col] = decidePiece(row, col);
                }

                else if(row == 1 || row == 6){
                    board[row][col] = new Position(row, col, new Pawn((row == 1) ? "black" : "white"), (row + col) % 2 == 0 ? "white" : "black");
                }
                
                else{
                    board[row][col] = new Position(row, col, null, (row + col) % 2 == 0 ? "white" : "black");
                }
            }
        }
    }

    private Position decidePiece(int row, int col){
        Position position = null;
        switch(col){
            case 0:
            case 7:
                position = new Position(row, col, new Rook((row == 0) ? "black" : "white"), (row + col) % 2 == 0 ? "white" : "black");
                break;
            case 1:
            case 6:
                position =  new Position(row, col, new Knight((row == 0) ? "black" : "white"), (row + col) % 2 == 0 ? "white" : "black");
                break;
            case 2:
            case 5:
                position = new Position(row, col, new Bishop((row == 0) ? "black" : "white"), (row + col) % 2 == 0 ? "white" : "black");
                break;
            case 3:
                position = new Position(row, col, new Queen((row == 0) ? "black" : "white"), (row + col) % 2 == 0 ? "white" : "black");
                break;
            case 4:
                position = new Position(row, col, new King((row == 0) ? "black" : "white"), (row + col) % 2 == 0 ? "white" : "black");
                break;
        }
        return position;
    }
}
