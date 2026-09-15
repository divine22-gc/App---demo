// Demonstrating the use of abstract classes and abstract methods

abstract class Shape {
    String name = "Shape";

    // abstract method - no body, must be implemented by subclasses
    abstract double area();

    // regular (concrete) method - can be used as-is or overridden
    void display() {
        System.out.println(name + " area: " + area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.name = "Rectangle";
    }

    @Override
    double area() {
        return length * breadth;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape();   // ERROR if uncommented: cannot instantiate an abstract class

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.display();
        rectangle.display();
    }
}