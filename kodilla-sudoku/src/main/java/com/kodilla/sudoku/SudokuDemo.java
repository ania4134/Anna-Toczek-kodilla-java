package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SudokuDemo {
    SudokuBoard board = new SudokuBoard();


    public void init() {
        List<SudokuElement> elements = new LinkedList<>();
        for(int i = 1; 1 < 42; i++) {
            elements.add(i, new SudokuElement());
        }

//        board.setElement(0,0, elements.get(1));
//        elements.get(1).setValue(4);
    }
}
