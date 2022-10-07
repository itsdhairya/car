// Dhairya Brahmbhatt (ID: 301288609)

import java.io.*;

public class CarTest {
    public static void main(String[] args) {
        // creating 2 objects of Dealership
        Dealership D1 = new Dealership("D001", "Raju's", "12 Vijay Cross Road, Baroda");
        Dealership D2 = new Dealership("D001", "Shyam's", "22 Khatra Gali, Ahmeadabad");
        // adding 3 cars to dealers carList
        D1.addCar("Trandon", 2018, "B.W", 19000, CarType.SUV);
        D1.addCar("Nissan", 2019, "Sporento", 25000, CarType.SEDAN);
        D1.addCar("Mitshubishi", 2020, "Lancer", 685000, CarType.HATCHBACK);
        D2.addCar("Toyota", 2018, "Leandor", 10080, CarType.TRUCK);
        D2.addCar("Land Rover", 2022, "LR22", 85000, CarType.SEDAN);
        D2.addCar("Tesla", 2020, "M", 90000, CarType.SUV);
        // calling showcars() for D1
        System.out.print(D1);
        D1.showCars("Trandon");
        D1.showCars("Nissan", 2018);
        D1.showCars("Mitshubishi", 2021, 4930);
        // calling showcars() for D2
        System.out.print(D2);
        D2.showCars("Toyota");
        D2.showCars("Land Rover", 2023);
        D2.showCars("Tesla", 2020, 98000);
        System.out.println();
    }
}
