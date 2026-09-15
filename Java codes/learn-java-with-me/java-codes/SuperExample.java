class Parent{
    void display(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display(){
        super.display(); //call parent class method
        System.out.println("Child class method");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}