import java.util.Scanner;

public class RockPaperScissor {

    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
        }
        return "";
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStatistics(String[] winners, int totalGames) {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        for (String winner : winners) {
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }
        double playerPercentage = (playerWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;
        double drawPercentage = (draws * 100.0) / totalGames;
        String[][] statistics = {
                {"Player", String.valueOf(playerWins), String.format("%.2f%%", playerPercentage)},
                {"Computer", String.valueOf(computerWins), String.format("%.2f%%", computerPercentage)},
                {"Draw", String.valueOf(draws), String.format("%.2f%%", drawPercentage)}
        };
        return statistics;
    }

    public static void displayResults(String[][] gameResults, String[][] statistics) {
        System.out.printf("%-10s%-15s%-15s%-10s%n", "Game", "Player Choice", "Computer Choice", "Winner");
        System.out.println("----------------