import java.util.ArrayList;

public class ArrayListExamples {
    
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Display the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);

        // Iterate through the ArrayList using a for-each loop
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Size of the ArrayList: " + fruits.size()); // Get the size of the ArrayList
        System.out.println("Contains Apple?" + fruits.contains("Apple")); // Check if the ArrayList contains "Apple"
    }
    
}
