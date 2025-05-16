package com.pluralsight.data;

import com.pluralsight.model.House;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {
    public String path = "data\\assets.csv";
    public static void displayHousing(House house){
        System.out.println("Description: " + house.getDescription() + "\n"
                + "Date Acquired: " + house.getDateAcquired() + "\n" +
                "Cost: $" + house.getOriginalCost() + "\n" +
                "Address: " + house.getAddress() + "\n" +
                "Condition: " + house.getCondition() + "\n" +
                "Square Foot: " + house.getSquareFoot() + "\n" +
                "Lot Size: " + house.getLotSize()
        );
        System.out.println(" ");
    }
    public void getAssets(){
     try {
         BufferedReader read = new BufferedReader(new FileReader(path));
         String line;
         while ((line = read.readLine()) != null){
             String[] linePart = line.split("\\|");
             if (linePart.length == 7){
                 House house = getHouse(linePart);
                 System.out.println(" ======== Housing Information ======= ");
                 System.out.println(" ");
                 displayHousing(house);
             }

         }
     }catch (IOException e){
         System.out.println("Invalid File " + e);
     }
    }
    private static House getHouse(String[] linePart) {
        String description = linePart[0];
        LocalDateTime dateAquired = LocalDateTime.parse(linePart[1]);
        double originalCost = Double.parseDouble(linePart[2]);
        String address = linePart[3];
        int condition = Integer.parseInt(linePart[4]);
        int squareFoot = Integer.parseInt(linePart[5]);
        int lotSize = Integer.parseInt(linePart[6]);
        House house = new House(description, dateAquired, originalCost, address, condition, squareFoot, lotSize);
        return house;
    }
    public void saveAssets(House house){
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String formattedDate = house.getDateAcquired().format(formatter);
        String outputString = String.format("%s|%s|%s|%s|%s|%s|%s",
                house.getDescription(), formattedDate, house.getOriginalCost(),
                house.getAddress(), house.getCondition(), house.getSquareFoot(),
                house.getLotSize());
        writer.write(outputString);
        writer.newLine();
        System.out.println("Housing Information saved...!");
        writer.close();
    }catch (IOException e){
        System.out.println("Invalid housing information" + e);
    }
    }
}
