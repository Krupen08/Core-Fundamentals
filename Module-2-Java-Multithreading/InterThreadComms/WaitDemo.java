class TotalEarnings extends Thread
{
    int total = 0;
    public void run()
    {
        synchronized (this) {
            for(int i = 1;i<=10;i++)
            {
                total = total + 100;
            }
            this.notify(); // notify() method will invoke the main Thread now and main thread will acquire lock now...
        }

    }
}

public class WaitDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        TotalEarnings t1 = new TotalEarnings();
        t1.start();

        // Here both main thread and t-0 thread starts simultaneously which invokes the sout(total_earning)
        // before the t-0 can calculate...
        // To avoid this, we use wait() and notify() method to make the main thread wait until Thread-0 completes run()
        // Always use wait(),notify() and notifyAll() inside synchronized block/method...
        synchronized (t1)
        {
            t1.wait(); // use try-catch or throws for exception handling in using of Inter Thread Communications...
        }
        System.out.println("Total Earnings: " + t1.total + " Rs");
    }
}
