package BasicThreadCode;

public class diffThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Goden Morgan is printed by " + Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        System.out.println("Hello World is printed by "+Thread.currentThread().getName());
        diffThread t1 = new diffThread();
        t1.start();
    }
}


