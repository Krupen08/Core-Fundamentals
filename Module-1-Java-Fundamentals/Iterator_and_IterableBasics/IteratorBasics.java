import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBasics
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>(List.of("Asha", "Bala", "Charlie", "Bala"));

        Iterator<String> it = names.iterator();
        while (it.hasNext())
        {
            String name = it.next();
            if (name.equals("Bala"))
            {
                it.remove();   // safe removal during iteration
            }
        }

        System.out.println(names);   // [Asha, Charlie]
    }
}