package InterruptsInThreadsDemo;

public class SleepDemo extends Thread
{
    // Here the run method can not use throws because there is not clause in signature predefined...
    // try-catch is mandatory...
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }

    // Here you can use "throws" alternate of try-catch...
    public static void main(String[] args)
    {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}
