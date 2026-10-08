package PracticeInterface2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface doSomething
{
    public void square(int a,int b);
}

public class PracticeInterface2
{
    public static void main(String[] args)
    {
        doSomething normal = (a, b) ->
        {
            System.out.println("Square of a is " + a * a + " and Square of b is " + b * b);
        };
        normal.square(3, 4);
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1));
        System.out.println("Square of numbers is " + numbers);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        System.out.println(numbers.parallelStream().reduce((a, b) -> a + b).get());

        numbers.sort((a, b) -> a - b);
        System.out.println(numbers);
    }
}