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
        String streetNumber = messageAndResponse(message + "Street: ");
        address.append(messageAndResponse(message + "City: ")).append(", ");
        //address.append(", ");
        address.append(messageAndResponse(message + "State: ").toUpperCase());
        address.append(" ");
        address.append(messageAndResponse(message + "Zip: "));
        String addressRest = address.toString();
        return (streetNumber + "\n" + addressRest);


    }
}
