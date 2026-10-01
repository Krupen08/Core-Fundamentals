package StreamAPI.sortedExample;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sortedExample
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(41, 72, 33, 4, 5, 61, 77, 58, 99, 10);
        List<Integer> ss = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ss);
    }
}
