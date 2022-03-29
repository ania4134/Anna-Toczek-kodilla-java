package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    String name;
    int numbersOfRoundsWon;
    int numbersOfRoundWonByGamer1 = 0;
    int numbersOfRoundWonByGamer2 = 0;
    int roundNumber = 1;
    boolean end = false;
    int choice1;
    int choice2;
    int min = 1;
    int max = 3;

    public void game() {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        name = userDialogs.getUserName();
        numbersOfRoundsWon = userDialogs.getNumbersOfRoundsWon();

        while (!end) {
            userDialogs.roundStart();

            choice1 = userDialogs.getChoice();
            choice2 = (int) (Math.random() * (max - min + 1) + min);

            if (choice1 == choice2) {
                System.out.println("Remis!");
            } else if (choice1 == 1 && choice2 == 3 || choice1 == 2  && choice2 == 1 || choice1 == 3 && choice2 == 2) {
                System.out.println("Wybrałeś " + choice1 + ", przeciwnik wybrał " + choice2);
                System.out.println("Wygrałeś rundę " + roundNumber + "!");
                numbersOfRoundWonByGamer1++;
            } else {
                System.out.println("Wybrałeś " + choice1 + ", przeciwnik wybrał " + choice2);
                System.out.println("Przegrałeś rundę " + roundNumber + ".");
                numbersOfRoundWonByGamer2++;
            }
            System.out.println();
            System.out.println("Bieżący wynik gry:  " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);

            if (numbersOfRoundWonByGamer1 == numbersOfRoundsWon) {
                System.out.println("Wygrałeś całą grę z wynikiem  " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);
                System.out.println("Gratulacje " + name + "! ");
                game.askingAboutNextGameOrEnd();
                roundNumber = 0;
                numbersOfRoundWonByGamer1 = 0;
                numbersOfRoundWonByGamer2 = 0;

            } else if (numbersOfRoundWonByGamer2 == numbersOfRoundsWon) {
                System.out.println("Końcowy wnik: " + numbersOfRoundWonByGamer1 + " : " + numbersOfRoundWonByGamer2);
                System.out.println("Przegrałeś grę :( ");
                game.askingAboutNextGameOrEnd();
                roundNumber = 0;
                numbersOfRoundWonByGamer1 = 0;
                numbersOfRoundWonByGamer2 = 0;
            }
            roundNumber++;
        }
    }

    public void askingAboutNextGameOrEnd() {

        if (userDialogs.askAboutEnd()) {
            System.out.println("Koniec gry");
            end = true;
        } else {
            numbersOfRoundsWon = userDialogs.getNumbersOfRoundsWon();
        }
    }
}