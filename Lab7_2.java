// Define a custom exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Lab7_2 {
    public static void main(String[] args) {
        try {
            // Throw the custom exception
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
