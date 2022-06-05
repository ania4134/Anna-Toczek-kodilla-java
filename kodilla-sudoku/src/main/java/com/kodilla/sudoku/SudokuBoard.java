package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {
    List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for(int col = 0; col < 9; col++) {
            rows.add(new SudokuRow());
        }
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = super.clone();

        clonedBoard.rows = new ArrayList<>();
        for(SudokuRow clonedRow : rows) {
            clonedBoard.rows.add(clonedRow);
            clonedRow.cols = new ArrayList<>();
            for(SudokuElement clonedElement : clonedRow.cols) {
                clonedRow.cols.add(clonedElement);
            }
        }
        return clonedBoard;
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public SudokuElement getElement(int col, int row) {
        return rows.get(col).getCols().get(row);
    }

    public void setElementValue(int col, int row, SudokuElement element) {
        rows.get(row).getCols().set(col, element);
    }

    @Override
    public String toString() {
        String e = "  ";
        String s = "|--------------------------|\n";
        for (int col = 0; col < 9; col++)
            s += rows.get(col).toString();
        s += "|--------------------------|\n";
        return s;
    }
}
