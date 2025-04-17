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

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //region setters/getters
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
//endregion

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

    public void dial(String callNumber) {
        System.out.println(this.owner + "'s phone is calling " + callNumber);
    }

    public void dial(CellPhone phone) {
        System.out.println(this.owner + "'s phone is calling " + phone.getPhoneNumber());
    }

}
