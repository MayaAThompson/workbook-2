package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        String name = messageAndResponse("Please enter your name: ").trim();
        String[] firstLast = name.split(" ");
        String firstName = firstLast[0];
        String lastName = firstLast[1];

        String dateInput = messageAndResponse("What date will you be coming? (MM/dd/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, formatter);

        int tickets = Integer.parseInt(messageAndResponse("How many tickets would you like?: "));

        System.out.println(tickets + " tickets reserved for " + date + " for " + lastName + ", " + firstName);
    }

    static String messageAndResponse(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
