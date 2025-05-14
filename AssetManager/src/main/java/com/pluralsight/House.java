package com.pluralsight;

import java.time.LocalDateTime;

public class House extends Asset{
    private String Address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, LocalDateTime dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
//        Instance variable
        Address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


    @Override
    public double getValue() {
//        double pricePerSquareFoot;
//        switch (condition){
//            case 1:
//                pricePerSquareFoot = 180.00;
//                break;
//            case 2:
//                pricePerSquareFoot = 130.00;
//                break;
//            case 3:
//                pricePerSquareFoot = 90.00;
//                break;
//            case 4:
//                pricePerSquareFoot = 80.00;
//                break;
//            default:
//                System.out.println("Invalid Condition Sir/Mme");
//                pricePerSquareFoot = 80.00;
//                break;
//
//        }
//        return (pricePerSquareFoot * squareFoot) + (0.25 * lotSize);
        double pricePerSquareFoot = switch (condition) {
            case 1 -> 180.00;
            case 2 -> 130.00;
            case 3 -> 90.00;
            case 4 -> 80.00;
            default -> {
                System.out.println("Invalid Condition Sir/Mme");
                yield 80.00;
            }
        };
        return (pricePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }
}
