package HashMapBasicsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapBasicsDemo {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        // 1. put() returns the OLD value (null if the key was new)
        System.out.println("1a. " + stock.put("apple", 10));   // null
        System.out.println("1b. " + stock.put("apple", 15));   // 10
        System.out.println("1c. " + stock);                    // {apple=15}

        // 2. A null from get() is ambiguous: missing key, or key mapped to null?
        stock.put("banana", null);
        System.out.println("2a. " + stock.get("banana"));              // null (key exists)
        System.out.println("2b. " + stock.get("grape"));               // null (key missing)
        System.out.println("2c. " + stock.containsKey("banana"));      // true
        System.out.println("2d. " + stock.containsKey("grape"));       // false
        System.out.println("2e. " + stock.getOrDefault("grape", 0));   // 0
        System.out.println("2f. " + stock.getOrDefault("banana", 0));  // null (key exists!)

        // 3. One null key and many null values are allowed
        stock.put(null, 25);
        System.out.println("3.  " + stock.get(null));                  // 1

        // 4. putIfAbsent only inserts when the key is missing
        stock.putIfAbsent("apple", 999);   // ignored, apple already has 15
        stock.putIfAbsent("mango", 5);
        System.out.println("4.  apple=" + stock.get("apple") + ", mango=" + stock.get("mango"));

        // 5. Counting with merge (order of printed entries is not guaranteed)
        String[] words = {"tea", "coffee", "tea", "milk", "tea", "coffee"};
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.merge(word, 1, Integer::sum);   // absent: put 1, present: old + 1
        }
        System.out.println("5.  " + counts);       // tea=3, coffee=2, milk=1

        // 6. Grouping with computeIfAbsent
        String[] names = {"Asha", "Ben", "Anil", "Bela", "Chitra"};
        Map<Character, List<String>> byInitial = new HashMap<>();
        for (String name : names) {
            byInitial.computeIfAbsent(name.charAt(0), key -> new ArrayList<>()).add(name);
        }
        System.out.println("6.  " + byInitial);    // A=[Asha, Anil], B=[Ben, Bela], C=[Chitra]
    }
}