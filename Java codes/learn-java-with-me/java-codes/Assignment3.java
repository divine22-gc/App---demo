class Student {

    // Static variables
    static String college = "SIT";
    static int count = 0;

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    // Method 1
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method overloaded
    void display(String message) {
        System.out.println(message + ": " + name);
    }

    // Static method
    static void showCount() {
        System.out.println("Number of students: " + count);
    }
}

public class Assignment3 {

    public static void main(String[] args) {

        Student s1 = new Student("Divine",18);
        Student s2 = new Student("Alice", 20);

        s1.display();
        s2.display("Student");

        System.out.println("College: " + Student.college);

        Student.showCount();
    }
}