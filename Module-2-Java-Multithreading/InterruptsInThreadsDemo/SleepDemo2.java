package InterruptsInThreadsDemo;

public class SleepDemo2 extends Thread
{
    public void run()
    {
        try
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(i + " : " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    static void main(String[] args)
    {
        SleepDemo2 s = new SleepDemo2();
        s.start();
        //s.run();

        SleepDemo2 s2 = new SleepDemo2();
        s2.start();
        //s2.run();

        // Here if we use run() method then the main method Thread will get invoke and the first
        // object will run first then the other object and so on
        // It will take more time than the start() method in which both threads run at same time...
        // start() method will lesser time than the run() method because of this...
    }
}
