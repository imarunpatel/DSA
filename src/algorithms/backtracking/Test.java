package algorithms.backtracking;

import java.util.ArrayList;

class Board {
    private int size;
    private char[][] grid;

    Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}



public class Test {
    public static void main(String[] args) {
        Board board = new Board(3);
        board.printBoard();
    }


}
