// Dhairya Brahmbhatt (ID: 301288609)

import java.util.ArrayList;

public class Dealership { 
    static ArrayList<Car> carList;
    String id;
    String name;
    String address;

    // constructor.
    public Dealership(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        carList = new ArrayList<Car>();
    }

    public void addCar(String manufacturer, int make, String model, double basePrice, CarType type)
    {
        Car C = new Car(manufacturer, make, model, basePrice, type);
        carList.add(C);
    }

    public void showCars(String manufacturer) {
        // Iterating using for loop
        for (int i = 0; i < carList.size(); i++)

            // Printing and display the elements in ArrayList
            if (carList.get(i).getManufacturer().equalsIgnoreCase(manufacturer)) {
                System.out.print(carList.get(i));
            }

    }

    public void showCars(String manufacturer, int make) {
        // Iterating using for loop
        for (int i = 0; i < carList.size(); i++)

            // Printing and display the elements in ArrayList
            if (carList.get(i).getManufacturer().equalsIgnoreCase(manufacturer) && carList.get(i).getMake() == make) {
                System.out.print(carList.get(i));
            }

    }

    public void showCars(String manufacturer, int make, double basePrice) {
        // Iterating using for loop
        for (int i = 0; i < carList.size(); i++)

            // Printing and display the elements in ArrayList
            if (carList.get(i).getManufacturer().equalsIgnoreCase(manufacturer) &&
                    carList.get(i).getMake() == make && carList.get(i).getPrice() <= basePrice) {
                System.out.print(carList.get(i));
            }

    }

    // getters
    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    // toString
    public String toString() {
        return "\n\nDealerID: " + getID() + "\nDealerName:" + getName() + "\nDealerAddress:" + getAddress();
    }
}
// end Class Dealership
