package com.pluralsight;

public class Vehicle {
    private int numOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private int speed;
    private int numOfWheel;
    private String Color;

    public Vehicle() {
        System.out.println("Hello");
    }

    public Vehicle(int numOfPassengers, int cargoCapacity, int fuelCapacity, int speed, int numOfWheel, String color) {
        System.out.println("Hello");
        this.numOfPassengers = numOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
        this.numOfWheel = numOfWheel;
        Color = color;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumOfWheel() {
        return numOfWheel;
    }

    public void setNumOfWheel(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public void ride(){
        System.out.println("Engine on");
    }
}
