package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    String name;
    int numbersOfRoundsWon;
    int numbersOfRoundWonByGamer1 = 0;
    int numbersOfRoundWonByGamer2 = 0;
    int round = 1;
    boolean end = false;
    String choice1;
    String choice2;
    int min = 1;
    int max = 3;

    public void game() {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Podaj swoje imię: ");
        name = scanner.next();
        System.out.println("Podaj ilość wygranych rund, po których ma nastąpić zwycięstwo: ");
        numbersOfRoundsWon = scanner.nextInt();

        while (!end) {
            System.out.println("Rozpoczynamy rundę " + round);
            System.out.println("Podaj znak 1, 2 lub 3 ");
            choice1 = scanner.next();

            int random = (int) (Math.random() * (max - min + 1) + min);
            choice2 = random + "";

            if (choice1.equals(choice2)) {
                System.out.println("Remis!");
            } else if (choice1.contains("1") && choice2.contains("3") || choice1.contains("2") && choice2.contains("1") || choice1.contains("3") && choice2.contains("2")) {
                System.out.println("Wybrałeś " + choice1 + ", przeciwnik wybrał " + choice2);
                System.out.println("Wygrałeś rundę " + round + "!");
                numbersOfRoundWonByGamer1++;
            } else {
                System.out.println("Wybrałeś " + choice1 + ", przeciwnik wybrał " + choice2);
                System.out.println("Przegrałeś rundę " + round + ".");
                numbersOfRoundWonByGamer2++;
            }
            System.out.println();
            System.out.println("Bieżący wynik gry:  " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);

            if (numbersOfRoundWonByGamer1 == numbersOfRoundsWon) {
                System.out.println("Wygrałeś całą grę z wynikiem  " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);
                System.out.println("Gratulacje " + name + "! ");
                game.askingAboutNextGameOrEnd();
                round = 0;
                numbersOfRoundWonByGamer1 = 0;
                numbersOfRoundWonByGamer2 = 0;

            } else if (numbersOfRoundWonByGamer2 == numbersOfRoundsWon) {
                System.out.println("Końcowy wnik: " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);
                System.out.println("Przegrałeś grę :( ");
                game.askingAboutNextGameOrEnd();
                round = 0;
                numbersOfRoundWonByGamer1 = 0;
                numbersOfRoundWonByGamer2 = 0;
            }
            round++;
        }
    }

    public void askingAboutNextGameOrEnd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jeśli chesz rozpocząć nową grę wprowadź 'n' ,natomiast jeśli chesz zakończyć wprowadź 'x'");
        if (scanner.next().contains("n")) {
            System.out.println("Czy na pewno zakonczyc aktualną grę? \n Wybierz 't' dla 'tak' ");
            if (scanner.next().contains("t")) {
                System.out.println("Podaj ilość wygranych rund, po których ma nastąpić zwycięstwo: ");
                numbersOfRoundsWon = scanner.nextInt();
            }
        } else if (scanner.next().contains("x")) {
            System.out.println("Czy na pewno zakonczyc grę? \n Wybierz 't' dla 'tak' lub 'n' dla 'nie' ");
            if (scanner.next().contains("t")) {
                System.out.println("Koniec gry.");
                end = true;
            } else if (scanner.next().contains("n")) {
                System.out.println("Jeśli chesz rozpocząć nową grę wprowadź 'n'");
                if (scanner.next().contains("n")) {
                    round = 0;
                    System.out.println("Podaj ilość wygranych rund, po których ma nastąpić zwycięstwo: ");
                    numbersOfRoundsWon = scanner.nextInt();
                }
            }
        }
    }
}