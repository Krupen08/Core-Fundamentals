public class Recursion_example
{
    static int sumDigit(int n)
    {
        if (n==0)
        {
            return 0;
        }
        return (n%10) + sumDigit(n/10);
    }

    public static void main(String[] args)
    {
        System.out.println(sumDigit(1234));
    }
}