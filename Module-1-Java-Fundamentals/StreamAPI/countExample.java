package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class countExample
{
    static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2,2,2, 3, 4, 5,3,5,4,10,1, 8, 9, 10);
        // Will check how many elements are left after applying filter.
        long c = list.stream().filter(integer -> integer==2).count();
        System.out.println(c);
    }
}
