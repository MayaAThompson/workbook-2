package com.pluralsight;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone cell1 = new CellPhone();
        cell1.setInfo();
        cell1.getInfo();

        CellPhone cell2 = new CellPhone(101010, "Galaxy s24+", "AT&T", "214-456-3456", "Maya Thompson");
        cell2.getInfo();

        System.out.println();
        cell2.dial(cell1.getPhoneNumber());
        Utils.pauseReturn();
        cell1.dial(cell2);
        Utils.pauseReturn();
    }

}
