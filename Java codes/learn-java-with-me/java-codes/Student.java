class ConstructorStudent {
    String name;
    int age;
    int prn;
    int wg;

    // Parameterized constructor
    public ConstructorStudent(String name, int age, int prn, int wg) {
        this.name = name;
        this.age = age;
        this.prn = prn;
        this.wg = wg;
    }

    // Constructor with only name
    public ConstructorStudent(String name) {
        this.name = name;
        this.age = 0;
        this.prn = 0;
        this.wg = 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PRN: " + prn);
        System.out.println("Weight: " + wg);
    }
}

public class Student {
    public static void main(String[] args) {

        ConstructorStudent s1 = new ConstructorStudent("John", 20, 12345, 70);
        ConstructorStudent s2 = new ConstructorStudent("Alice", 22, 67890, 60);
        ConstructorStudent s3 = new ConstructorStudent("Divine");

        s1.display();
        s2.display();
        s3.display();
    }
}