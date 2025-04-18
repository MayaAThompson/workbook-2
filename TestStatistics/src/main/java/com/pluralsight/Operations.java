package com.pluralsight;

import java.util.Arrays;

public class Operations {

    public static int average(int[] score) {

        int i = 0;
        for(int myScore: score) {
            i += myScore;
        }

        return i / score.length;
    }

    public static int highScore(int[] score) {

        Arrays.sort(score);
        return score[score.length - 1];

    }

    public static int lowScore(int[] score) {

        Arrays.sort(score);
        return score[0];

    }
}
