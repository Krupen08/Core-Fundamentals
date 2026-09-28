public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int data = 25 / 5;
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block.");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}