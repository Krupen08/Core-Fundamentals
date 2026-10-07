package InterruptDemo;

// interrupt() method is use to interrupt an executing thread.
// Only works when the thread is in waiting style or sleeping...
// If thread is not sleeping then it will show normal behavior...
public class ThreadInterruptDemo extends Thread
{
    public void run()
    {
        try
        {
            for (int i = 1; i <=5; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupt is done :- " + e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        ThreadInterruptDemo t1 = new ThreadInterruptDemo();
        t1.start();
        t1.interrupt();
    }
}
