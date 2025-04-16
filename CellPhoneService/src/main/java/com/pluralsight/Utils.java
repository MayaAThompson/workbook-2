package com.pluralsight;

import java.util.Scanner;

public class Utils {
    static String messageAndResponse(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
