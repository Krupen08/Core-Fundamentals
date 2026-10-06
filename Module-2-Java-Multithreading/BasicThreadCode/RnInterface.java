package BasicThreadCode;

// Better to use  Runnable interface
// Reason :- Its provides Multiple Inheritance which is not possible with
// extending Thread Class.
class Test2 implements Runnable
{
    public void run()
    {
        System.out.println("RnInterface is running");
    }

    public int run(int a, int b)
    {
        System.out.println("inside the overloaded method...");
        return (a + b);
    }
    public void start()
    {
        System.out.println("inside the overloaded start method...");
    }
}
//class demo
//{
//    public void run()
//    {
//        System.out.println("inside the overloaded method...");
//    }
//}
public class RnInterface {
    public static void main(String[] args)
    {
        Test2 test2 = new Test2();

        //System.out.println(test2.run(5,4));
        Thread t1 = new Thread(test2); // Passing reference of the object inside Thread class object to invoke Thread class methods like start().
        t1.start();
        test2.start();

    }
}

