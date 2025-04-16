package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void getInfo() {
        System.out.println("\nSN: " + this.serialNumber);
        System.out.println("Model: " + this.model);
        System.out.println("Carrier: " + this.carrier);
        System.out.println("Phone #:" + this.phoneNumber);
        System.out.println("Owner: " + this.owner);
    }

    public void setInfo() {
        this.setSerialNumber(Integer.parseInt(Utils.messageAndResponse("\nWhat is the serial number? ")));
        this.setModel(Utils.messageAndResponse("What is the model of the phone? "));
        this.setCarrier(Utils.messageAndResponse("Who is the carrier? "));
        this.setPhoneNumber(Utils.messageAndResponse("What is the phone number? "));
        this.setOwner(Utils.messageAndResponse("Who is the owner? "));
    }

}
