package com.pluralsight;

import java.util.*;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your full name?\nEnter here: ");
        String fullName = scanner.nextLine().trim();

        String[] parsedName = fullName.split(" ");
        String firstName = parsedName[0];
        String lastName = parsedName[parsedName.length - 1];
        String middleName = parsedName[1];

        if (middleName == lastName) {
            System.out.println("First name: " + firstName + "\nMiddle name: (none)\nLast name: " + lastName);
        }
        else {
            System.out.println("First name: " + firstName + "\nMiddle name: " + middleName + "\nLast name: " + lastName);
        }

    }

}
