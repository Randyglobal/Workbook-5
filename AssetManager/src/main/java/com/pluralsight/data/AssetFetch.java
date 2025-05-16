package com.pluralsight.data;

import com.pluralsight.model.Asset;
import com.pluralsight.model.House;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AssetFetch {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Asset> assets = new ArrayList<>();
    public void display(String message){
        System.out.println(message);
    }
    public void getHomeInfo(){
        display("========== Welcome to house test ========");
        display("Enter House Description");
        String description = scanner.nextLine();
        display("Enter Cost of house");
        double originalCost = scanner.nextDouble();
        scanner.nextLine();
        display("Enter House Address");
        String address = scanner.nextLine();
        display("Enter Condition");
        int condition = scanner.nextInt();
        display("Enter SquareFoot");
        int  squareFoot = scanner.nextInt();
        display("Enter Lot Size");
        int lotSize = scanner.nextInt();
        scanner.nextLine();
        House house = new House(description, LocalDateTime.now(), originalCost, address, condition, squareFoot, lotSize);
        assets.add(house);
        FileManager fileManager = new FileManager();
        fileManager.saveAssets(house);
    }
}
