package com.pluralsight;

public class Vehicle {

    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle() {

    }

    public Vehicle(long id, String makeModel, String color, int odo, double price) {
        this.vehicleId = id;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odo;
        this.price = price;
    }

    public static void displayVehicles(Vehicle[] vehicles) {

        for(Vehicle vehicle : vehicles) {

            if(vehicle != null) {
                vehicle.displayVehicle();

            }
        }
    }

    public static void searchMakeModel(Vehicle[] vehicles) {

        String search = Utils.messageAndResponse("Search: ");
        boolean found = false;

        for(Vehicle vehicle : vehicles) {
            if(vehicle != null && vehicle.makeModel.contains(search)) {
                vehicle.displayVehicle();
                found = true;
                break;
            }

        }
        if(!found) {
            System.out.println(search + " not found.\n");
        }
    }

    public static void addVehicle(Vehicle[] vehicles) {

        int i = 0;
        for(Vehicle vehicle : vehicles) {
            if(vehicle != null) {
                i++;
            }
            else {
                vehicles[i] = new Vehicle();
                vehicles[i].setVehicleId(Integer.parseInt(Utils.messageAndResponse("What is the vehicle ID? ")));
                vehicles[i].setMakeModel(Utils.messageAndResponse("What is the make and model? "));
                vehicles[i].setColor(Utils.messageAndResponse("What is the color? "));
                vehicles[i].setOdometerReading(Integer.parseInt(Utils.messageAndResponse("What is the odometer reading? ")));
                vehicles[i].setPrice(Integer.parseInt(Utils.messageAndResponse("What is the price? ")));
                break;
            }
        }
    }

    private void displayVehicle() {
        System.out.println("Stock number: " + this.vehicleId);
        System.out.println("Make/Model: " + this.makeModel);
        System.out.println("Color: " + this.color);
        System.out.println("Odometer: " + this.odometerReading);
        System.out.printf("Price: %.2f\n\n",  this.price);
    }

    //region getters/setters
    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //endregion

}
