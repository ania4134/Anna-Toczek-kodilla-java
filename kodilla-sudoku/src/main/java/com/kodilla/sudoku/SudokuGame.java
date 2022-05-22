package com.kodilla.sudoku;

public class SudokuGame {
    SudokuBoard board = new SudokuBoard();


    public void game() {
        UserDialogs.startGame();

        if (UserDialogs.isProvidedSudoku()) {
            sudokuAlghoritm();
        } else {
            UserDialogs.getNumbers();
            if (ifNumbersAreCorrect())
                board.setElementValue(UserDialogs.getNumbers().get("col"),UserDialogs.getNumbers().get("row"), UserDialogs.getNumbers().get("value"));
        }
    }

    public boolean ifNumbersAreCorrect() {
        int col = UserDialogs.getNumbers().get("col");
        int row = UserDialogs.getNumbers().get("row");
        int value = UserDialogs.getNumbers().get("value");

        if (isInBounds(col, row, value) && ifFieldIsEmpty(col, row))
            return true;
        else
            return false;
    }

    public boolean isInBounds(int col, int row, int value) {
        boolean result = false;

        if(col > 0 && col < 10 && row > 0 && row < 10 && value > 0 && value < 10)
            result = true;
        return result;
    }

    public boolean ifFieldIsEmpty(int col, int row) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        if(sudokuBoard.getElement(col, row).value == -1)
            return true;
        else
            return false;
    }

    public boolean resolveSudoku() {
        boolean isEnd = UserDialogs.askAboutEnd();
        if (isEnd)
            return false;
        else
            return true;
    }
}