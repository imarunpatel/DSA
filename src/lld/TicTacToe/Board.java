package lld.TicTacToe;

import java.sql.SQLOutput;

public class Board {
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

    public boolean placeSymbol(int row, int col, char symbol) {
        if(row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '-') {
            grid[row][col] = symbol;
            System.out.println("hi");
            return true;
        }
        return false;
    }

    public boolean checkWin(char symbol) {
        // Check rows
        for(int i=0; i<size; i++) {
            if(checkRowCol(grid[i][0], grid[i][1], grid[i][2], symbol)) {
                return true;
            }
        }

        // Check cols
        for(int i=0; i<size; i++) {
            if(checkRowCol(grid[0][i], grid[1][i], grid[2][i], symbol)) {
                return true;
            }
        }

        // Check diagonals
        if(checkRowCol(grid[0][0], grid[1][1], grid[2][2], symbol)) {
            return true;
        }

        if(checkRowCol(grid[0][2], grid[1][1], grid[2][0], symbol)) {
            return true;
        }

        return false;
    }

    private boolean checkRowCol(char c1, char c2, char c3, char symbol) {
        return (c1 == symbol && c2 == symbol && c3 == symbol);
    }

    public boolean isFull() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public void display() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
