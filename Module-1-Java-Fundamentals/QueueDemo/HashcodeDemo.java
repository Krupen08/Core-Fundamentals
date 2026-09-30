public class HashcodeDemo
{
    static void main(String[] args)
    {
        String sb1 = "Hello";
        String sb2 = "Hello";
        String sb3 = "Hello";

        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Hello");
        StringBuilder s3 = new StringBuilder("Hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}






































