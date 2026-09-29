import java.util.concurrent.Callable;

public class diamond_problem
{
    static void main(String[] args)
    {
        D d = new D();
        d.fun();
    }
}

interface A
{
    void fun();
}

interface B extends A
{
    default void fun()
    {
        System.out.println("inside B interface...");
    }
}
interface C extends A
{
    default void fun()
    {
        System.out.println("inside C interface...");
    }
}
class D implements B, C
{
    // Here the fun method has implementation in the D concrete class even the B and C interface extends it.
    //
    @Override
    public void fun()
    {
        System.out.println("Inside D class..");
        B.super.fun();    // here you can use the default keyword using the super keyword by writing the interface name befor it.
        C.super.fun();    // same for this

    }
}