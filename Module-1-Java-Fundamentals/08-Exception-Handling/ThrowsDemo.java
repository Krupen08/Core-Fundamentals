// Custom Checked Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowsDemo {
    // Declares that this method can throw a checked exception
    static void validateScore(int score) throws InvalidAgeException {
        if (score < 0 || score > 100) {
            throw new InvalidAgeException("Score must be between 0 and 100.");
        }
        System.out.println("Valid score: " + score);
    }

    public static void main(String[] args) {
        try {
            validateScore(105);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}