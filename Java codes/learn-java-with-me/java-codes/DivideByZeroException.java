class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {
        super(message);
    }
}

// Using the custom exception
public class EXCP {

    public static void divide(int a, int b) throws DivideByZeroException {

        if (b == 0) {
            throw new DivideByZeroException(
                "Division by zero is not allowed."
            );
        }

        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {

        try {
            divide(10, 0);
        }
        catch (DivideByZeroException e) {
            System.out.println(
                "Caught the exception: " + e.getMessage()
            );
        }
    }
}