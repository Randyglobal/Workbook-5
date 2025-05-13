package Vehicles;

import com.pluralsight.Vehicle;

public class Car extends Vehicle {
    private int currentGear;
    //generated Constructor
    public Car(int numOfPassengers, int cargoCapacity, int fuelCapacity, int speed, int numOfWheel, String color, int currentGear) {
        super(numOfPassengers, cargoCapacity, fuelCapacity, speed, numOfWheel, color);
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
