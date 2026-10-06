public class ThreadNameDemo
{
    static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName()); // main
        // It will show it is in main thread...
        // currentThread() method is static method hence can be invoked using Thread class directly.
        // getName() method will give the Name of Thread... it is instance method...


        // Setting name for main Thread...
        // If any exception occurs then it will show
        // Exception in thread "Krupen" java.lang.ArithmeticException
        Thread.currentThread().setName("Krupen");
        System.out.println(Thread.currentThread().getName());
        // int a = 10/0;
    }
}
