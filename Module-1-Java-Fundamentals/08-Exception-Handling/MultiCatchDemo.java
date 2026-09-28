public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]); // Triggers ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Error: Math error occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Error: General exception occurred.");
        }
    }
}