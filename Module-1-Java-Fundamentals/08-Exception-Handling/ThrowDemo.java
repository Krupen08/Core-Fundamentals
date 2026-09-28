public class ThrowDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
        }
        System.out.println("Access granted - You are old enough!");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught throw: " + e.getMessage());
        }
    }
}