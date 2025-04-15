package com.pluralsight;

import java.util.*;

public class AddressBuilder {

    public static void main(String[] args) {

        System.out.println("Please provide the following information: \n");

        String name = messageAndResponse("Full name: ");
        System.out.println();

        String billingAddress = getAddress("Billing ");
        System.out.println();

        String shippingAddress = getAddress("Shipping ");
        System.out.println("\n\n" + name + "\n\nBilling Address:\n" + billingAddress + "\n\nShipping Address:\n" + shippingAddress);
    }

    static String messageAndResponse(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    static String getAddress(String message) {
        StringBuilder address = new StringBuilder();
        address.append(messageAndResponse(message + "Street: ")).append("\n");
        address.append(messageAndResponse(message + "City: ")).append(", ");
        address.append(messageAndResponse(message + "State: ").toUpperCase()).append(" ");
        address.append(messageAndResponse(message + "Zip: "));
        return address.toString();


    }
}
