import java.util.function.Consumer;

public class consumerDemo
{
    static void main(String[] args)
    {
        Consumer<String> c = n -> System.out.println(n);
        // accept method is in Consumer Functional interface.
        // Its prints value only i.e return type is void.
        c.accept("Layoff");
    }
}
