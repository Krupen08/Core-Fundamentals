package SetBasicDemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBasicDemo {

    public static void main(String[] args) {

        String[] input = {"pear", "apple", "banana", "apple", "cherry"};
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (String fruit : input) {
            boolean added = hashSet.add(fruit);
            linkedSet.add(fruit);
            treeSet.add(fruit);
            if (!added) {
                System.out.println("Duplicate ignored: " + fruit);
            }
        }

        System.out.println("HashSet:       " + hashSet);   // order not guaranteed
        System.out.println("LinkedHashSet: " + linkedSet); // [pear, apple, banana, cherry]
        System.out.println("TreeSet:       " + treeSet);   // [apple, banana, cherry, pear]

        // null handling
        hashSet.add(null);
        System.out.println("HashSet contains null: " + hashSet.contains(null));
        try {
            treeSet.add(null);
        } catch (NullPointerException e) {
            System.out.println("TreeSet rejects null");
        }

        // Set math: union, intersection, difference
        Set<Integer> a = new TreeSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> b = new TreeSet<>(Set.of(3, 4, 5, 6));

        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);                        // [1, 2, 3, 4, 5, 6]
        Set<Integer> intersection = new TreeSet<>(a);
        intersection.retainAll(b);              // [3, 4]
        Set<Integer> difference = new TreeSet<>(a);
        difference.removeAll(b);                // [1, 2]
        System.out.println(union + " " + intersection + " " + difference);

        // Remove duplicates from a list, keeping the original order
        List<Integer> numbers = List.of(3, 1, 3, 2, 1);
        List<Integer> unique = new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println("Unique in order: " + unique);   // [3, 1, 2]
    }
}
