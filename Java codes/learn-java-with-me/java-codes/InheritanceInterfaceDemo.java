import java.util.*;

// ---------- Interface ----------
interface Insurable {
    double calculateInsurance();   // abstract method
}

interface Serviceable {
    void serviceVehicle();
}

// ---------- Base (Parent) Class ----------
class Vehicle {
    String brand;
    int year;
    double baseValue;

    Vehicle(String brand, int year, double baseValue) {
        this.brand = brand;
        this.year = year;
        this.baseValue = baseValue;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + " | Year: " + year + " | Value: Rs." + baseValue);
    }

    void start() {
        System.out.println(brand + " vehicle is starting...");
    }
}

// ---------- Derived Class 1: Inheritance + Interfaces ----------
class Car extends Vehicle implements Insurable, Serviceable {
    int numDoors;

    Car(String brand, int year, double baseValue, int numDoors) {
        super(brand, year, baseValue);   // calling parent constructor
        this.numDoors = numDoors;
    }

    @Override
    public double calculateInsurance() {
        return baseValue * 0.04;   // 4% of value
    }

    @Override
    public void serviceVehicle() {
        System.out.println(brand + " Car is being serviced: oil change, brake check.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();   // reuse parent method
        System.out.println("Type: Car | Doors: " + numDoors);
    }
}

// ---------- Derived Class 2: Inheritance + Interfaces ----------
class Bike extends Vehicle implements Insurable, Serviceable {

    Bike(String brand, int year, double baseValue) {
        super(brand, year, baseValue);
    }

    @Override
    public double calculateInsurance() {
        return baseValue * 0.02;   // 2% of value
    }

    @Override
    public void serviceVehicle() {
        System.out.println(brand + " Bike is being serviced: chain lube, tyre check.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bike");
    }
}

// ---------- Main Class ----------
public class InheritanceInterfaceDemo {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2023, 1500000, 4);
        Bike bike = new Bike("Honda", 2022, 120000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);

        for (Vehicle v : vehicles) {
            System.out.println("----------------------------------");
            v.displayInfo();     // inherited/overridden method
            v.start();            // inherited method

            // Since v is of type Vehicle, we check for interface implementation
            if (v instanceof Insurable) {
                Insurable insurableItem = (Insurable) v;
                System.out.println("Insurance Amount: Rs." + insurableItem.calculateInsurance());
            }
            if (v instanceof Serviceable) {
                Serviceable serviceableItem = (Serviceable) v;
                serviceableItem.serviceVehicle();
            }
        }
    }
}
