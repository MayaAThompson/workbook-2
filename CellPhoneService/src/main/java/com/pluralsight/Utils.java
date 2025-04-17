package com.pluralsight;

import java.util.Scanner;

public class Utils {

    static Scanner scanner = new Scanner(System.in);

    static String messageAndResponse(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    static void pauseReturn() {
        scanner.nextLine();
    }
}
