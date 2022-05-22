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
        System.out.println("Wypełniaj puste tak długo jak zechcesz, natomiast " +
                "jeżeli wpiszesz słowo 'SUDOKU' - algorytm aplikacji rozwiąże sudoku do końca za Ciebie! ");
        System.out.println("Zaczynamy!");
    }

//    public static boolean askAboutEnd() {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println(" N - nowa gra, X - koniec gry");
//            String s = scanner.nextLine().toUpperCase();
//            if (s.equals("N"))
//                return false;
//            else if (s.equals("X"))
//                return true;
//            else
//                System.out.println("zła odpowiedź - spróbuj jeszcze raz");
//        }
//    }

    public static boolean isProvidedSudoku() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        if (s.equals("SUDOKU"))
            return true;
        else
            return false;
    }


    public static String provideNumber() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    public static Map<String, Integer> getNumbers() {
        Map<String, Integer> data = new HashMap();

        while(true) {
            String s = provideNumber();
            try {
                int col = s.charAt(0);
                int row = s.charAt(2);
                int value = s.charAt(4);
                data.put("col", col);
                data.put("row", row);
                data.put("value", value);
                return data;
            } catch (Exception e) {
                System.out.println("Podane wartości musza byc cyframi. Sprobuj ponownie");
            }
        }
    }
}
