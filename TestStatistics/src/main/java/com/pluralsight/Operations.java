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

    public static int median(int[] score) {

        Arrays.sort(score);
        int median = 0;
        if(score.length % 2 == 0) {
            int middle = score.length / 2;
            median = (score[middle] + (score[middle] - 1)) /2;
        }
        if(score.length % 2 != 0) {
            int middle = score.length /2;
            median = score[middle];
        }

        return median;
    }
}
