package Interface;

import java.util.Comparator;

public class comparatorDemo
{
    static void main(String[] args)
    {
        Comparator<Integer> com = (a, b) -> a.compareTo(b);
        for (int a = 1; a <= 10; a++)
        {
            for (int b = 1; b <= 10; b++)
            {
                System.out.print(com.compare(a, b));

            }
            System.out.println(" ");

        }
    }
}
