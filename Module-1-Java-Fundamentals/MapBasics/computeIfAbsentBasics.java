package MapBasics;

import java.util.*;

public class computeIfAbsentBasics
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie", "Brad");
        Map<Character,List<String>> groupNames = new HashMap<>();

        for (String  name : names)
        {
            char first = name.charAt(0);

            // computeIfAbsent ensures an ArrayList is created ONLY when a new letter appears.
            // It then immediately returns that list (new or existing) so we can add the name.
            groupNames.computeIfAbsent(first, k -> new ArrayList<>()).add(name);
        }
        System.out.println("Grouped Alphabetically:" + groupNames);
    }
}
