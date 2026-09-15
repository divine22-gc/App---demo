public class Assignment1 {

    // Method to display student details
    public static void displayStudent(String name, int age, double cgpa) {
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("CGPA         : " + cgpa);
    }

    public static void main(String[] args) {

        // Variables
        String name = "Divine";
        int age = 18;
        double cgpa = 8.75;

        // Calling the method
        displayStudent(name, age, cgpa);
    }
}
