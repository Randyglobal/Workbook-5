package com.pluralsight;

import com.pluralsight.data.AssetFetch;
import com.pluralsight.data.FileManager;

public class Main {
    public static void main(String[] args) {
        AssetFetch fetch = new AssetFetch();
        FileManager file = new FileManager();
        fetch.getHomeInfo();
        file.getAssets();
//        ArrayList<Asset> assets = new ArrayList<>();
//
//        House house = new House("My House", LocalDateTime.now(),
//                400000, "10416 Sparrow Springs Ln",
//                1, 1000, 1500);
//        House vacationHome = new House("Vacation Home", LocalDateTime.now(),
//                450000, "15892 Randolph rd",
//                2, 900, 2000);
//        Vehicle truck = new Vehicle("Business Truck", LocalDateTime.now(),
//                12000, "Nissan", 2020,
//                2540);
//        Vehicle regularCar = new Vehicle("Spots Car", LocalDateTime.now().minusYears(5),
//                9000, "Toyota", 2022,
//                5458);
//
//        assets.add(house);
//        assets.add(vacationHome);
//        assets.add(truck);
//        assets.add(regularCar);
//        System.out.println("======= Assets Info =======");
//        System.out.println(" ");
//            for (int i = 0; i < assets.size(); i++) {
//                Asset asset = assets.get(i);
//                System.out.println("Group: " + i);
//                System.out.println("Description: " + asset.getDescription());
//                System.out.println("Date Acquired: " + asset.getDateAcquired());
//                System.out.println("Original Price: " + asset.getOriginalCost());
//                System.out.println("Value: " + asset.getValue());
////                Down casting to check for the address
//                if (asset instanceof House){
//                    House houseAsset = (House) asset;
//                    System.out.println("Address: " + houseAsset.getAddress());
//                }else if (asset instanceof Vehicle){
//                    Vehicle vehicleAsset = (Vehicle) asset;
//                    System.out.println("Model: " + vehicleAsset.getMakeModel());
//                }else {
//                    System.out.println("Getters not found");
//                }
//                System.out.println(" ");
//
//            }
    }
}
