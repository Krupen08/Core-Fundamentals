package DaemonThreadDemo;

public class DaemonThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Daemon Thread");
    }

    public static void main(String[] args)
    {
        // You can not create main Thread as Daemon Thread because JVM has already started Main
        // thread and changing thread after starting will generate Exception.
        
        System.out.println("Main Thread");
        DaemonThreadDemo obj = new DaemonThreadDemo();
        obj.setDaemon(true);
        obj.start();
    }
}
