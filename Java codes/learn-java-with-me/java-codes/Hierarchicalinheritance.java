class Animal {
    void eats() {
        System.out.println("Thisanimal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eats(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class

        Cat cat = new Cat();
        cat.eats(); // Inherited method from Animal class
        cat.meow(); // Method from Cat class
    }
}
