// ---------- File 1: Save as Rectangle.java inside a folder named "shapes" ----------
package shapes;

public class Rectangle {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}


// ---------- File 2: Save as Circle.java inside the same folder "shapes" ----------
package shapes;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}


// ---------- File 3: Save as PackageDemo.java OUTSIDE the "shapes" folder ----------
import shapes.Rectangle;
import shapes.Circle;

public class PackageDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(4);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Circle: " + c.area());
    }
}