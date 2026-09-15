// Demonstrating the use of the 'final' keyword with variables, methods, and classes

class Vehicle {
    final int wheels = 4;   // final variable - value cannot be changed once assigned

    final void start() {    // final method - cannot be overridden by subclasses
        System.out.println("Vehicle is starting...");
    }

    void display() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}


final class Car extends Vehicle {   // final class - cannot be inherited further
    void showBrand() {
        System.out.println("This is a Car object.");
    }
}


public class FinalDemo {
    public static void main(String[] args) {
        final int speedLimit = 120;   // final local variable
        System.out.println("Speed limit is fixed at: " + speedLimit + " km/h");

        // speedLimit = 150;   // ERROR if uncommented: cannot reassign a final variable

        Car myCar = new Car();
        myCar.display();
        myCar.start();
        myCar.showBrand();
    }
}