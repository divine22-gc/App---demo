class Animal {
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class
    }
}