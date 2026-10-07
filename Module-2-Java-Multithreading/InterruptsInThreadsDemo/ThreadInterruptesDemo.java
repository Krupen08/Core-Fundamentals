package InterruptInThreadsDemo;

public class ThreadInterruptesDemo extends Thread
{
    public void run()
    {
        {
            System.out.println(Thread.interrupted());
            System.out.println(Thread.currentThread().isInterrupted());

            try
            {
                for(int i = 1; i <= 5; i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);

                }
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args)
    {
        ThreadInterruptesDemo t1 = new ThreadInterruptesDemo();
        t1.start();
        //t1.interrupt();
    }
}
