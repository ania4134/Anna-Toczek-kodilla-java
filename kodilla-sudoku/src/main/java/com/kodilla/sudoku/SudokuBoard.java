package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public void setElement(int col, int row, int value) {
        rows.get(row).getCols().set(col, new SudokuElement(value));
    }

    @Override
    public String toString() {
        String s = "|--------------------------|\n";
        for (int col = 0; col < 9; col++)
            s += rows.get(col).toString();
        s += "|--------------------------|\n";
        return s;
    }

    public void demo() {
        setElement(0,0,4);
        setElement(0,3,8);
        setElement(0,4,6);
        setElement(0,5,2);
        setElement(0,7,9);
        setElement(1,0,9);
        setElement(1,2,7);
        setElement(1,6,6);
        setElement(1,7,8);
        setElement(1,8,2);
        setElement(2,0,8);
        setElement(2,4,3);
        setElement(2,5,7);
        setElement(2,8,4);
        setElement(3,0,2);
        setElement(3,1,5);
        setElement(3,2,4);
        setElement(3,7,1);
        setElement(3,8,7);
        setElement(4,2,9);
        setElement(4,3,4);
        setElement(4,5,5);
        setElement(4,6,3);
        setElement(4,8,8);
        setElement(5,0,3);
        setElement(5,1,8);
        setElement(5,5,9);
        setElement(6,0,1);
        setElement(6,1,2);
        setElement(6,2,6);
        setElement(6,7,3);
        setElement(6,8,5);
        setElement(7,3,6);
        setElement(7,5,3);
        setElement(7,6,2);
        setElement(7,8,1);
        setElement(8,0,7);
        setElement(8,1,4);
        setElement(8,3,5);
        setElement(8,5,1);
        setElement(8,8,9);
    }
}
