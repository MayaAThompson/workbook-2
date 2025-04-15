package com.pluralsight;

import java.util.*;

public class FullNameApplication {

    public static void main(String[] args) {

        System.out.println("What is your name?");

        String firstName = nameGet("First name:");
        String middleName = nameGet("Middle name:");
        String lastName = nameGet("Last name:");
        String suffix = nameGet("Suffix:");

        String fullName;
        if (middleName.isEmpty() && suffix.isEmpty()) {
            fullName = firstName + " " + lastName;
        }
        else if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName + ", " + suffix;
        }
        else if (suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        else {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
    }

    static String nameGet(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return response.trim();
    }
}
