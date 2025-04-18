package com.pluralsight;

public class DiceRoll {

    public static void main(String[] args) {

        int roll1;
        int roll2;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = Dice.roll(6);
            roll2 = Dice.roll(6);

            int diceSum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " -- " + roll2 + " Sum: " + diceSum);

            if(diceSum == 2) {
                counter1++;
            }
            if(diceSum == 4) {
                counter2++;
            }
            if(diceSum == 6) {
                counter3++;
            }
            if(diceSum == 7) {
                counter4++;
            }
        }

        System.out.println("2s rolled: " + counter1 + "\n4s rolled: " + counter2 + "\n6s rolled: " + counter3 + "\n7s rolled: " + counter4);




    }
}
