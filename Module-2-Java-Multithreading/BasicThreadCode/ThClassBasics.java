
class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread1 is running");
    }
}

public class ThClassBasics
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        t1.start();
        //t1.start();  Exception in thread "main" java.lang.IllegalThreadStateException
    }
}