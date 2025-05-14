package Vehicles;

import com.pluralsight.Vehicle;

public class HoverCraft extends Vehicle {
    private double altitude;
    private boolean isInWater;
    private boolean isInAir;
    //generated Constructor
//    public HoverCraft(int numOfPassengers, int cargoCapacity, int fuelCapacity, int speed, int numOfWheel, String color, double altitude, boolean isInWater, boolean isInAir) {
//        super(numOfPassengers, cargoCapacity, fuelCapacity, speed, numOfWheel, color);
//        this.altitude = altitude;
//        this.isInWater = isInWater;
//        this.isInAir = isInAir;
//    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isInWater() {
        return isInWater;
    }

    public void setInWater(boolean inWater) {
        isInWater = inWater;
    }

    public boolean isInAir() {
        return isInAir;
    }

    public void setInAir(boolean inAir) {
        isInAir = inAir;
    }
    public void ride() {
        System.out.println("Engine On");
    }
}
