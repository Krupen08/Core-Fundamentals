public class JavaResolution
{
    static void main(String[] args)
    {
        C1 c = new C1();
        c.fun();
    }
}

interface A1
{
    default void fun()
    {
        System.out.println("Inside A interfce/...");
    }
}
class B1
{
    // Here by default the class gets priority for invokation
    // This is known as Java Resolution.
    public void fun()
    {
        System.out.println("Inside B class...");
    }
}
class C1 extends B1 implements A1
{
    // If we override the fun() method then this method is going to get invoked.
//    @Override
//    public void fun()
//    {
//        System.out.println("Inside C class...");
//    }
}
