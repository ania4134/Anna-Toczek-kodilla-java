package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> rows = new ArrayList<>();

    public SudokuRow() {
        for(int col = 0; col < 9; col++) {
            rows.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int col = 0; col <9; col++)
            s += rows.get(col).toString() + "|";
        s += "\n";
        return s;
    }
}
