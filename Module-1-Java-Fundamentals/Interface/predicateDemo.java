import java.util.function.Predicate;

public class predicateDemo
{
    static void main(String[] args)
    {
        Predicate<String> p = i -> i.startsWith("H");
        System.out.println(p.test("Hello"));

        Predicate<Integer> age = n -> n>18;
        System.out.println(age.test(12));
    }
}
