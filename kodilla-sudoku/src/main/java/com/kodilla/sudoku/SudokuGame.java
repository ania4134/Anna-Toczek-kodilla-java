package com.kodilla.sudoku;

public class SudokuGame {
    SudokuBoard board = new SudokuBoard();

    public boolean resolveSudoku() {
        UserDialogs.startGame();
        boolean result;

        if (UserDialogs.isProvidedSudoku()) {
            sudokuAlgorithm();
            result = true;
        } else {
            UserDialogs.getNumbers();
            if (ifNumbersAreCorrect())
                board.setElementValue(UserDialogs.getNumbers().get("col"), UserDialogs.getNumbers().get("row"),
                        UserDialogs.getNumbers().get("value"));
            System.out.println(board);
            result = false;
        }
        return result;
    }

    private void sudokuAlgorithm() {
        for(int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if(board.getElement(col, row).getValue() == -1) {
                    checkRows(col, row);
                    checkCols(col, row);
                    checkFields(col, row);
                    if(board.getElement(col, row).getPossibleValues().size() == 1) {
                        int value = board.getElement(col, row).getPossibleValues().stream().findAny().get();
                        board.setElementValue(col, row, value);
                    }
                }
            }
        }
        System.out.println(board);
    }

    private void checkRows(int col, int row) {

        for(int i = 0; i < 9; i++) {
            if(board.getElement(col, i).getValue() != -1) {
                int value = board.getElement(col, i).getValue();
                board.getElement(col, row).getPossibleValues().remove(value);
            }
        }
    }

    private void checkCols(int col, int row) {

        for(int i = 0; i < 9; i++) {
            if(board.getElement(i, row).getValue() != -1) {
                int value = board.getElement(i, row).getValue();
                board.getElement(col, row).getPossibleValues().remove(value);
            }
        }
    }

    private void checkFields(int col, int row) {
        if(col < 4 && row < 4) {
            for(int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++)
                    remove(col, row, i, j);
            }
        } else if (col >= 4 && col < 7 && row < 4) {
            for(int i = 4; i < 7; i++) {
                for(int j = 0; j < 4; j++)
                    remove(col, row, i, j);
            }
        } else if (col >= 7 && col <10 && row < 4) {
            for(int i = 7; i < 10; i++) {
                for(int j = 0; j < 4; j++)
                    remove(col, row, i, j);
            }
        } else if (col < 4 && row >= 4 && row <7) {
            for(int i = 0; i < 4; i++) {
                for (int j = 4; j < 7; j++)
                    remove(col, row, i, j);
            }
        } else if (col >= 4 && col <7 && row >= 4 && row <7) {
            for(int i = 4; i < 7; i++) {
                for (int j = 4; j < 7; j++)
                    remove(col, row, i, j);
            }
        } else if (col >= 7 && col <10 && row >= 4 && row <7) {
            for(int i = 7; i < 10; i++) {
                for (int j = 4; j < 7; j++)
                    remove(col, row, i, j);
            }
        } else if (col < 4 && row >= 7 && row <10) {
            for(int i = 0; i < 4; i++) {
                for (int j = 7; j < 10; j++)
                    remove(col, row, i, j);
            }
        } else if (col >= 4 && col <7 && row >= 7 && row < 10) {
            for(int i = 4; i < 7; i++) {
                for (int j = 7; j < 10; j++)
                    remove(col, row, i, j);
            }
        } else {
            for(int i = 7; i < 10; i++) {
                for (int j = 7; j < 10; j++)
                    remove(col, row, i, j);
            }
        }
    }

    private void remove(int col, int row, int i, int j) {
        if(board.getElement(i, j).getValue() != -1) {
            int value = board.getElement(i, j).getValue();
            board.getElement(col, row).getPossibleValues().remove(value);
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

        if (col > 0 && col < 10 && row > 0 && row < 10 && value > 0 && value < 10)
            result = true;
        return result;
    }

    public boolean ifFieldIsEmpty(int col, int row) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        if (sudokuBoard.getElement(col, row).value == -1)
            return true;
        else
            return false;
    }
}