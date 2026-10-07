package InterruptsInThreadsDemo;

//If thread wants to wait for another thread  to complete its task, then we should use join()
// join throws InterruptedException
// public final void join() throws InterruptedException
// public final void join(long ms) throws InterruptedException
// public final void join(long ms, int ns) throws InterruptedException
public class ThreadJoinDemo extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Child Thread : " + i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    static void main(String[] args) throws InterruptedException
    {
        ThreadJoinDemo tj = new ThreadJoinDemo();
        tj.start();
        tj.join();
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
