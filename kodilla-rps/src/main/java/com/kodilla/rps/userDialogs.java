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
            System.out.println("\nPodaj ilość wygranych rund, po których ma nastąpić zwycięstwo: ");
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
            System.out.println("\nPodaj swoje imię: ");
            String name = scanner.nextLine().toUpperCase();
            if (name.length() > 2 && name.length() < 10)
                return name;
            else
                System.out.println("Imie powinno składać sie z minimum 3 oraz maksymalnie 9 znaków. Spróbuj jeszcze raz");
        }
    }

    public static void roundStart(int roundNumber) {
        System.out.println("\nRozpoczynamy rundę " + roundNumber);
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

    public static void showChoices(int choice1, int choice2) {
        System.out.println("Wybrałeś " + choice1 + ", przeciwnik wybrał " + choice2);
    }

    public static void showRoundStatistics(int numbersOfRoundWonByGamer1, int numbersOfRoundWonByGamer2) {
        System.out.println("Bieżący wynik gry   " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);
    }

    public static void showGameStatistics(int numberOfRoundWonByGamer1, int numberOfRoundWonByGamer2, String name) {
        if (numberOfRoundWonByGamer1 > numberOfRoundWonByGamer2) {
            System.out.println("\nWygrałeś całą grę z wynikiem  " + numberOfRoundWonByGamer1 + " : " + numberOfRoundWonByGamer2);
            System.out.println("Gratulacje " + name + "! ");
        } else {
            System.out.println("Końcowy wnik  " + numberOfRoundWonByGamer1 + " : " + numberOfRoundWonByGamer2);
            System.out.println("Przegrałeś grę :( ");
        }
    }
}

