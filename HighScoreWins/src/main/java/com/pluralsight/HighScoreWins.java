package com.pluralsight;

import java.util.*;

public class HighScoreWins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your scores here: ");
        String scoreString = scanner.nextLine();

        String[] teamsAndScores = scoreString.split("\\|");
        String[] teams = teamsAndScores[0].split(":");
        String[] scores = teamsAndScores[1].split(":");
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        String winner;
        if (score1 > score2) {
            winner = teams[0];
        }
        else if (score1 < score2) {
            winner = teams[1];
        }
        else {
            winner = "Tie!";
        }

        System.out.println("Winner: " + winner);

    }
}
