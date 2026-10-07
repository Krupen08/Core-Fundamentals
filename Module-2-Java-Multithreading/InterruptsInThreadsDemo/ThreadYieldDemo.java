package InterruptsInThreadsDemo;

// public static native void yiled();
// yield() method : which stops the current working thread and give chance to other thread for execution
// yield provides the hint to thread scheduler, then it is upto thread-scheduler to accept or ignore the request..
// output might not always be same as it is dependent on the scheduler...
public class ThreadYieldDemo extends Thread
{
    public void run()

    {
        Thread.yield();
        for (int i = 0; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args)
    {
        ThreadYieldDemo td = new ThreadYieldDemo();
        td.start();
        Thread.yield(); // if you want main method to stop and provide chance to other threads for execution...
        int i;
        for (i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
