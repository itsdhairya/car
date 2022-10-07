// Dhairya Brahmbhatt (ID: 301288609)

import java.io.*;

public class CarTest {
    public static void main(String[] args) {
        // creating 2 objects of Dealership
        Dealership G1 = new Dealership("D001", "Raju's", "12 Vijay Cross Road, Baroda");
        Dealership G2 = new Dealership("D001", "Shyam's", "22 Khatra Gali, Ahmeadabad");
        // adding 3 cars to dealers carList
        G1.addCar("Trandon", 2018, "B.W", 19000, CarType.SUV);
        G1.addCar("Nissan", 2019, "Sporento", 25000, CarType.SEDAN);
        G1.addCar("Mitshubishi", 2020, "Lancer", 685000, CarType.HATCHBACK);
        G2.addCar("Toyota", 2018, "Leandor", 10080, CarType.TRUCK);
        G2.addCar("Land Rover", 2022, "LR22", 85000, CarType.SEDAN);
        G2.addCar("Tesla", 2020, "M", 90000, CarType.SUV);
        // calling showcars() for first dealer 
        System.out.print(G1);
        G1.showCars("Trandon");
        G1.showCars("Nissan", 2018);
        G1.showCars("Mitshubishi", 2021, 4930);
        // calling showcars() for Second dealer
        System.out.print(G2);
        G2.showCars("Toyota");
        G2.showCars("Land Rover", 2023);
        G2.showCars("Tesla", 2020, 98000);
        System.out.println();
    }
}
