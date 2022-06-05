package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> cols = new ArrayList<>();

    public SudokuRow() {
        for(int row = 0; row < 9; row++) {
            cols.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int row = 0; row <9; row++)
            s += cols.get(row).toString() + "|";
        s += "\n";
        return s;
    }
}
