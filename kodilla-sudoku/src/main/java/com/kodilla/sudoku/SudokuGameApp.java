package com.kodilla.sudoku;

public class SudokuGameApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        boolean gameFinished = false;
        UserDialogs.startGame();
        SudokuGame theGame = new SudokuGame();
        while (!gameFinished) {
            gameFinished = theGame.resolveSudoku();
        }
    }
}
