package com.kodilla.rps;

import java.util.Scanner;

public class userDialogs {

    public static boolean askAboutEnd() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" N - nowa gra, X - koniec gry");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("N"))
                return false;
            else if (s.equals("X"))
                return true;
            else
                System.out.println("zła odpowiedź - spróbuj jeszcze raz");
        }
    }

    public static int getNumbersOfRoundsWon() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj ilość wygranych rund, po których ma nastąpić zwycięstwo: ");
            String s = scanner.nextLine();
            try {
                int n = Integer.parseInt(s);
                if (n > 0 && n <= 9) {
                    return n;
                } else {
                    System.out.println(" Liczba musi byc z przedziału 1 - 9. Spróbuj ponownie");
                }
            } catch (Exception e) {
                System.out.println("Niepoprawna liczba - spróbuj ponownie");
            }
        }
    }

    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj swoje imię: ");
            String name = scanner.nextLine().toUpperCase();
            if (name.length() > 2 && name.length() < 10)
                return name;
            else
                System.out.println("Imie powinno składać sie z minimum 3 oraz maxymalnie 9 znaków. Spróbuj jeszcze raz");
        }
    }

    public static void roundStart() {
        int roundNumber = 1;
        System.out.println("Rozpoczynamy rundę " + roundNumber);
        roundNumber++;
    }

    public static Integer getChoice() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj znak 1, 2 lub 3 ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2 || choice == 3)
                    return choice;
                else
                    System.out.println("zła odpowiedź - spróbuj jeszcze raz");
            } catch (Exception e) {
                System.out.println("zła odpowiedź - podaj wartość liczbową");
            }
        }
    }
}

