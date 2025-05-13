package com.pluralsight;

import Vehicles.Car;
import Vehicles.Moped;
import Vehicles.SemiTruck;

public class Program {
    public static void main(String[] args) {
//        Without a constructor defined, the program generates an invisible constructor, thats why you can call the classes
//        Moped slowRide = new Moped();
//        Car car = new Car();
//        SemiTruck truck = new SemiTruck();
//        Since no constructor at the beginning, you have to set the values
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);
//        car.setCurrentGear(2);
//        car.setNumOfPassengers(2);
//        truck.setTrailerAttached(true);
//        Created a constructor
        Car car1 = new Car(2, 4, 6, 20, 18, "Red", 4);
//        then you get them
//        System.out.println(slowRide.getColor() + " " + slowRide.getFuelCapacity());
        System.out.println("Number of Passengers: " + car1.getNumOfPassengers() + "\n"+
                            "Cargo Capacity: " + car1.getCargoCapacity() + "\n"+
                             "Fuel Capacity: " + car1.getFuelCapacity() + "\n" +
                              "Speed: " + car1.getSpeed() + "\n" +
                                 "Number of wheels:" + car1.getNumOfWheel() + "\n" +
                                    "Color: " + car1.getColor() + "\n" +
                                         "Current Gear: " + car1.getCurrentGear());
//        System.out.println(truck.isTrailerAttached());

    }
}
