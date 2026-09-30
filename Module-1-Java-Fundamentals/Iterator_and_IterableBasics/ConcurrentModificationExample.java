import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // Using a for-each loop to iterate and remove the FIRST element
        for (String fruit : list) {
            if (fruit.equals("Apple")) {
                list.remove(fruit); // This will crash on the next iteration!
            }
        }
    }
}