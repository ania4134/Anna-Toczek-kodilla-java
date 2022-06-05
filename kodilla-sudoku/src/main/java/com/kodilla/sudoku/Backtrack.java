package com.kodilla.sudoku;

public class Backtrack {
    SudokuBoard board = new SudokuBoard();
    private SudokuBoard clonedBoard;
    private int guessedRow;
    private int guessedCol;
    private int guessedValue;

    public Backtrack() throws CloneNotSupportedException {
        clonedBoard = board.deepCopy();
    }

    public int getGuessedRow() {
        return guessedRow;
    }

    public int getGuessedCol() {
        return guessedCol;
    }

    public int getGuessedValue() {
        return guessedValue;
    }

    public void setGuessedRow(int guessedRow) {
        this.guessedRow = guessedRow;
    }

    public void setGuessedCol(int guessedCol) {
        this.guessedCol = guessedCol;
    }

    public void setGuessedValue(int guessedValue) {
        this.guessedValue = guessedValue;
    }
}
