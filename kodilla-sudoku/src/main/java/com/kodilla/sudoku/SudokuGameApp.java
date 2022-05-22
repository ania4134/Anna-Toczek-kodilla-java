package com.kodilla.sudoku;

public class SudokuGameApp {

    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();
        System.out.println(board);
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
