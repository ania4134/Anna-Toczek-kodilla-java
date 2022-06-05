package com.kodilla.sudoku;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserDialogs {

    public static void startGame() {
        System.out.println("Witamy w grze sudoku!");
        System.out.println("Wypełniaj puste pola cyframi według zasad gry sudoku. Wpisz współrzędne miejsca " +
                "(kolumna, wiersz) oraz wartość, jaka ma się w danym miejscu znaleźć.");
        System.out.println("Cyfry muszą być z przedziału 1-9, oddziel je przecinkami. ");
        System.out.println("Wypełniaj puste pola tak długo jak zechcesz, natomiast " +
                "jeżeli wpiszesz słowo 'SUDOKU' - algorytm aplikacji rozwiąże sudoku do końca za Ciebie! ");
        System.out.println("Zaczynamy!");
    }

    public static Map<String, Integer> getNumbers() {
        Map<String, Integer> data = new HashMap();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("SUDOKU")) {
                data.put("SUDOKU", 1);
                return data;
            } else {
                try {
                    int col = s.charAt(0);
                    int row = s.charAt(2);
                    int value = s.charAt(4);
                    data.put("col", col - 1);
                    data.put("row", row - 1);
                    data.put("value", value);
                    return data;
                } catch (Exception e) {
                    System.out.println("Podane wartości musza byc cyframi. Sprobuj ponownie");
                }
            }
        }
    }

    public static void providedWrongNumbers() {
        System.out.println("Złe warości. Spróbuj ponownie");
    }
}
