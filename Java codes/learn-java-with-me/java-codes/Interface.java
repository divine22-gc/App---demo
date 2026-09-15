interface Animal {
    void sounds();
}

class Dog implements Animal{
    public void sounds(){
        System.out.println("Dog barks");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sounds(); // Call the sounds method from Dog class
    }
}