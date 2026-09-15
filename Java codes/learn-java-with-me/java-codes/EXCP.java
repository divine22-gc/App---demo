class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EXCP {

    // Validates age and throws custom exception if under 18
    public static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    // Main method
    public static void main(String[] args) {

        try {
            validate(13);   // This will trigger the exception
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}