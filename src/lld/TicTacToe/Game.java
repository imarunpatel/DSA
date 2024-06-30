package lld.TicTacToe;

import java.util.List;
import java.util.Scanner;

public class Game {
    private Board board;
    private List<Player> players;
    private Player currentPlayer;

    public Game(int boardSize, List<Player> players) {
        this.board = new Board(boardSize);
        this.players = players;
        this.currentPlayer = players.getFirst();
    }

    public void startGame() {
        boolean gameWon = false;
        boolean gameDraw = false;

        Scanner scanner = new Scanner(System.in);

        while(!gameDraw && !gameWon) {
            displayBoard();
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (0, 1) or 2");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(makeMove(row, col)) {
                gameWon = checkWin();
                gameDraw = checkDraw();
                System.out.println(gameWon + " - " + gameDraw);
                if(!gameWon && !gameDraw) {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again");
            }
        }

        displayBoard();

        if(gameWon) {
            System.out.println(currentPlayer.getName() + " wins!");
        } else {
            System.out.println("It's a draw");
        }

        scanner.close();
    }

    public boolean makeMove(int row, int col) {
        return board.placeSymbol(row, col, currentPlayer.getSymbol());
    }

    public boolean checkWin() {
        return board.checkWin(currentPlayer.getSymbol());
    }

    public boolean checkDraw() {
        return board.isFull();
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == players.get(0)) ? players.get(1) : players.get(0);
    }

    public void displayBoard() {
        board.display();;
    }
}
