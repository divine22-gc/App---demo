public class Vector {
    public static void main(String[] args) {
        // Create a vector of integers
        java.util.Vector<Integer> numbers = new java.util.Vector<>();

        // Add elements to the vector
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Vector: " + numbers);
        numbers.remove(1);
        System.out.println("Vector after removal: " + numbers);

        System.out.println("Size of the vector: " + numbers.size());
        System.out.println("Element at index 0: " + numbers.get(0));
    }
}
