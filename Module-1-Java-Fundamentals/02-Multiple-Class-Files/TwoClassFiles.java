public class TwoClassFiles
{

    public static void main(String[] args)
    {

        Account Acc = new Account("Krupen", 30000);
        Acc.deposit(5000);
        Acc.values();
    }

}
class Account{

    public String Owner ;
    public double balance ;

    public Account(String Owner,double balance)
    {
        this.balance = balance;
        this.Owner = Owner;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void values()
    {
        System.out.println("Account Name : " + Owner + "\tBalance: " + balance);
    }

    // Defines how the Account object should be represented as a String when printed.
    /*@Override
    public String toString()
    {
        String s = "Account [Owner=" + Owner + " , balance=" + balance + "]" ;
        return s;
    }
*/
}