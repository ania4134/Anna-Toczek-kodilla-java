package com.kodilla.sudoku;

public class SudokuGameApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
