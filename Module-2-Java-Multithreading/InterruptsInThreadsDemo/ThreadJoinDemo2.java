package InterruptsInThreadsDemo;

public class ThreadJoinDemo2 extends Thread
{
    static Thread mainthread;
    public void run()
    {
        try
        {
            mainthread.join();
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
        mainthread = Thread.currentThread();
        ThreadJoinDemo2 tj = new ThreadJoinDemo2();
        tj.start();
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
