package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class mapAndFilter
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // map and filter functions both together in single pipeline.
        List<Integer> special = list.stream().filter(a -> a%2 == 0).map(a -> a*10).collect(Collectors.toList());
        System.out.println(special);
    }
}
