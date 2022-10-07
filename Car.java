// Dhairya Brahmbhatt (ID: 301288609)

public class Car {
    String manufacturer;
    int make;
    String model;
    static int VI_NUMBER = 1001;
    int VIN;
    double basePrice;
    CarType type;

    // constructor
    public Car(String manufacturer, int make, String model, double basePrice, CarType type) {
        this.manufacturer = manufacturer;
        this.make = make;
        this.model = model;
        this.basePrice = basePrice;
        this.type = type;
        VI_NUMBER += 100;
        this.VIN = VI_NUMBER;
        this.VIN = this.VIN + 10;
    }

    // getters
    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getVIN() {
        return this.VIN;
    }

    public double getPrice() {
        return this.basePrice;
    }

    public CarType getType() {
        return this.type;
    }

    public int getVI_NUMBER() {
        return VI_NUMBER;
    }

    // toString
    public String toString()
    {
    return "\n\nCar Details: \n Manufacturer: "+getManufacturer()+"\nMake:"+getMake()+"\nModel:"+getModel()+"\nVIN:"+getVIN()
    +"\nVI_NUMBER:"+getVI_NUMBER()+"\nBase Price: "+getPrice()+"\nCar Type: " +getType();
    }
}