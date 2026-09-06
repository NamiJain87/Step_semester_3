package main.java.string.class_problems;

import java.util.Random;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] computerMoves = new String[5];

        String[] moves = {"Rock", "Paper", "Scissors"};

        Random random = new Random();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("Round | Player Move | Computer Move | Result");

        for (int i = 0; i < 5; i++) {

            computerMoves[i] = moves[random.nextInt(3)];

            String result = playRound(playerMoves[i], computerMoves[i]);

            System.out.println((i + 1) + " | " + playerMoves[i] + " | "
                    + computerMoves[i] + " | " + result);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win % = " + winPercentage);
    }
}