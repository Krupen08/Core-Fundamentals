import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Demo
{
    public static void main(String[] args)
    {
        Krupen a = new Krupen();
        MathConstant b = new Krupen();
        a.show();
        b.show();

        // You can use interface variables directly by calling with interface name and its variable
        // In real world projects, Developers define constant variables inside an interface and use this constant variables directly in different files.
        System.out.println(MathConstant.PI);
    }
}

interface MathConstant
{
    double PI = 3.14;
    // This value is Constant by default in interface.
    // Constant = public static and final.
    // i.e = public static final double PI = 3.14.
    // Every value which is declared inside the interface are constant : Their object cant be instantiated so changing
    // the variable value is not possible hence CONSTANT.

    void show();
}
class Krupen implements MathConstant
{
    public void show()
    {
        System.out.println(PI);
    }
}