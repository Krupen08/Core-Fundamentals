public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Triggers ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide by zero.");
        }
    }
}