package com.pluralsight;

public class TestStatistics {


    public static void main(String[] args) {

        int[] scores = {87, 73, 91, 65, 78, 92, 84, 69, 88, 76};

        int average = Operations.average(scores);
        System.out.println("Average: " + average);

        int highScore = Operations.highScore(scores);
        System.out.println("High Score: " + highScore);

        int lowScore = Operations.lowScore(scores);
        System.out.println("Low Score: " + lowScore);

    }


}
