
import java.util.function.Function;

public class functionDemo
{
    static void main(String[] args)
    {
        Function<Integer, Integer> f = n -> n*n;
        // .apply Function Functional Interface me use hota h.
        System.out.println(f.apply(12));
    }
}
