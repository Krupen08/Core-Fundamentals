import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class mapExample
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> square = list.stream().map(x -> x*x).toList(); // Newer version
        //List<Integer> square = list.stream().map(x -> x*x).collect(Collectors.toList(); // Older version

        System.out.println(square);
    }
}