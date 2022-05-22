package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    List<SudokuRow> cols = new ArrayList<>();

    public SudokuBoard() {
        for(int row = 0; row < 9; row++) {
            cols.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getCols() {
        return cols;
    }

    public SudokuElement getElement(int col, int row) {
        return cols.get(row).getRows().get(col);
    }

    public void setElementValue(int col, int row, int value) {
        getElement(col, row).value = value;
    }

    @Override
    public String toString() {
        String e = "  ";
        String s = "|--------------------------|\n";
        for (int row = 0; row < 9; row++)
            s += cols.get(row).toString();
        s += "|--------------------------|\n";
        return s;
    }
}
