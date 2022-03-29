package com.kodilla.rps;

public class Game {

    String name;
    int numberOfRoundsWon;
    int numberOfRoundWonByGamer1 = 0;
    int numberOfRoundWonByGamer2 = 0;
    int roundNumber = 1;
    boolean end = false;
    int choice1;
    int choice2;
    int min = 1;
    int max = 3;

    public void game() {
        name = userDialogs.getUserName();
        numberOfRoundsWon = userDialogs.getNumbersOfRoundsWon();

        while (!end) {
            userDialogs.roundStart(roundNumber);
            choice1 = userDialogs.getChoice();
            choice2 = (int) (Math.random() * (max - min + 1) + min);

            if (choice1 == choice2) {
                System.out.println("Remis!");
            } else if ((choice1 == 1 && choice2 == 3) || (choice1 == 2 && choice2 == 1) || (choice1 == 3 && choice2 == 2)) {
                userDialogs.showChoices(choice1, choice2);
                System.out.println("Wygrałeś rundę " + roundNumber + "!");
                numberOfRoundWonByGamer1++;
            } else {
                userDialogs.showChoices(choice1, choice2);
                System.out.println("Przegrałeś rundę " + roundNumber + ".");
                numberOfRoundWonByGamer2++;
            }
            userDialogs.showRoundStatistics(numberOfRoundWonByGamer1, numberOfRoundWonByGamer2);
            checkWinner(numberOfRoundsWon, numberOfRoundWonByGamer1, numberOfRoundWonByGamer2, name);
            roundNumber++;
        }
    }

    private void checkWinner(int numberOfRoundsWon, int numberOfRoundWonByGamer1, int numberOfRoundWonByGamer2, String name) {
        if (numberOfRoundWonByGamer1 == numberOfRoundsWon || numberOfRoundWonByGamer2 == numberOfRoundsWon) {
            userDialogs.showGameStatistics(numberOfRoundWonByGamer1, numberOfRoundWonByGamer2, name);
            askAboutNextGameOrEnd();
        }
    }

    private void askAboutNextGameOrEnd() {
        if (userDialogs.askAboutEnd()) {
            System.out.println("Koniec gry");
            end = true;
        } else {
            numberOfRoundsWon = userDialogs.getNumbersOfRoundsWon();
            roundNumber = 0;
            numberOfRoundWonByGamer1 = 0;
            numberOfRoundWonByGamer2 = 0;
        }
    }
}