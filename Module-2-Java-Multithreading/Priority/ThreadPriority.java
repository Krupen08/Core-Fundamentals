package Priority;

public class ThreadPriority extends Thread
{
    public void run()
    {
        System.out.println("Child Thread Priority : " + Thread.currentThread().getPriority());
    }


    public static void main(String[] args)
    {
        // Default Main Thread Priority is 5...
        ThreadPriority obj = new ThreadPriority();
        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());

        // Child Method inherit same Priority of Main until and unless it is changed explicitly...
        // If we change the Main Thread Priority then Child Priority will also get changed...
        ThreadPriority t = new ThreadPriority();
        t.start();
    }
}
