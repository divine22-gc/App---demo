// Demonstrating the implementation of interfaces in Java

interface Drawable {
    void draw();   // abstract method (implicitly public and abstract)
}

interface Colorable {
    void setColor(String color);   // another interface with its own abstract method
}

// A class can implement multiple interfaces
class Circle implements Drawable, Colorable {
    double radius;
    String color;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Circle color set to " + color);
    }
}

class Square implements Drawable {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side " + side);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface reference can point to any implementing class object
        Drawable d1 = new Circle(5);
        Drawable d2 = new Square(4);

        d1.draw();
        d2.draw();

        // Using the Colorable interface
        Circle c = new Circle(3);
        c.draw();
        c.setColor("Red");
    }
}