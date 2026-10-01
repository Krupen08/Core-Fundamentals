package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterExample
{
    static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList()); // Gives even numbers from list.
        System.out.println(even);
    }
}
