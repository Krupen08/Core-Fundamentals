package PracticeInterface1;

interface PaymentInterface
{
    void pay(double amount);

}

class UPI implements PaymentInterface
{
    @Override
    public void pay(double amount)
    {
        System.out.println("I am paying UPI and amount is "+ amount);
    }
}

class CreditCard implements PaymentInterface
{
    @Override
    public void pay(double amount)
    {
        System.out.println("I am paying CreditCard and amount is " + amount);
    }
}
public class PracticeInterface1
{
    public static void main(String[] args)
    {
        PaymentInterface obj = new UPI();
        PaymentInterface obj2 = new CreditCard();
        obj.pay(300.0);
        obj2.pay(3000.0);

    }
}

