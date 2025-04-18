package com.pluralsight;

public class Dice {

    public static int roll(int dieNum) {
        int roll;
        roll = (int)(Math.random() * dieNum) + 1;
        return roll;
    }
}
