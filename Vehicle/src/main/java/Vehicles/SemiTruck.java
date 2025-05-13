package Vehicles;

import com.pluralsight.Vehicle;

public class SemiTruck extends Vehicle {
    private boolean isTrailerAttached;
//generated Constructor
    public SemiTruck(int numOfPassengers, int cargoCapacity, int fuelCapacity, int speed, int numOfWheel, String color, boolean isTrailerAttached) {
        super(numOfPassengers, cargoCapacity, fuelCapacity, speed, numOfWheel, color);
        this.isTrailerAttached = isTrailerAttached;
    }

    public boolean isTrailerAttached() {
        return isTrailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        isTrailerAttached = trailerAttached;
    }
}
