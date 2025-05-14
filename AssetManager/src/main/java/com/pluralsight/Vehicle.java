package com.pluralsight;

import java.time.LocalDateTime;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, LocalDateTime dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double currentValue = getOriginalCost();
        int mileRage = getOdometer();
        String model = getMakeModel();
        int age = 2025 - year;
        if (age >= 0 && age <= 3){
            for (int i = 0; i < age; i++) {
                currentValue *= (1 - 0.3);
            }

        } else if (age >= 4 && age <= 6) {
            for (int i = 0; i < age; i++) {
                currentValue *= (1 - 0.6);
            }
        } else if (age >= 7 && age <= 10) {
            for (int i = 0; i < age; i++) {
                currentValue *= (1 - 0.8);
            }
        } else if (age > 10) {
            for (int i = 0; i < age; i++) {
                currentValue -= 1000.00;
            }
        }
        if (mileRage > 100000 && makeModel.equalsIgnoreCase("Honda") || model.equalsIgnoreCase("Toyota")) {
               currentValue *= 0.75;
        }
        return currentValue;
    }
}
