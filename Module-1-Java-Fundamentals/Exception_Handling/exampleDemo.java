//import java.lang.Throwable;
//public class exampleDemo
//{
//    public static void main(String[] args) throws Throwable
//    {
//
//        try
//        {
//            System.out.println("In try block");
//            int x = 10 / 2  ;
//            System.out.println("In try block second time");
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("cant divide by zero");
//        }
//        finally
//        {
//            System.out.println("In finally block");
//        }
//    }
//}
public class exampleDemo {
    public static void main(String[] args) {

        try {
            System.out.println("A");
            int x = 10 / 0;
            System.out.println("B");
        }
        catch (ArithmeticException e) {
            System.out.println("C");
        }

        System.out.println("E");
    }
}