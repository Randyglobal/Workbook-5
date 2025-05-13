package Vehicles;

import com.pluralsight.Vehicle;

public class Moped extends Vehicle {
    private boolean hasBasket;
    //generated Constructor
    public Moped(int numOfPassengers, int cargoCapacity, int fuelCapacity, int speed, int numOfWheel, String color) {
        super(numOfPassengers, cargoCapacity, fuelCapacity, speed, numOfWheel, color);
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}
