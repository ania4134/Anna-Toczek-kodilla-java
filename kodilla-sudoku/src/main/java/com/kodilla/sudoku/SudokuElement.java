package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public int value;
    public static int EMPTY = -1;
    List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        this.value = EMPTY;
        for(int i = 1; i < 10; i++) {
            possibleValues.add(i);
        }
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String s;
        s = (value == -1) ? "  " : value + " ";
        return s;
    }
}
