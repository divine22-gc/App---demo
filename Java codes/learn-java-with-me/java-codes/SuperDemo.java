class Animal {
    String type = "Animal";

    Animal(String name) {
        System.out.println("Animal constructor called: " + name);
    }

    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog(String name) {
        super(name);  // Calls the parent class constructor
        System.out.println("Dog constructor called: " + name);
    }

    void sound() {
        super.sound();  // Calls the parent class's overridden method
        System.out.println("Dogs bark.");
    }

    void printType() {
        System.out.println("Subclass type: " + type);
        System.out.println("Superclass type: " + super.type);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.sound();
        d.printType();
    }
}