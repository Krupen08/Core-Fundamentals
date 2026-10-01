package StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctExample
{
    static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,3,5,4,10,1, 8, 9, 10);
        List<Integer> dis = list.stream().distinct().collect(Collectors.toList());
        System.out.println(dis);
    }
}
