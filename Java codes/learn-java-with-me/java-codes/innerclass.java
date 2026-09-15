class Outer {
    private String message = "Hello from Outer class!";

    // Inner class
    class Inner {
        void display() {
            System.out.println("Message: " + message);
        }
    }

    // Method to demonstrate the inner class
    void show() {
        System.out.println("Inside show method");
    }

    // Animal class
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {

        // Create an instance of the outer class
        Outer obj = new Outer();

        // Create an instance of the inner class
        Outer.Inner inner = obj.new Inner();

        // Call the display method of the inner class
        inner.display();

        // Create an anonymous class from Animal
        Outer.Animal a = obj.new Animal() {
            @Override
            void sound() {
                super.sound();
                System.out.println("Dog barks");
            }
        };

        // Call sound method
        a.sound();
    }
}