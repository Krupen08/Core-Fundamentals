public class SwapDemo {
    public static void swap(Account a, Account b) {
        Account temp = a;
        a = b;
        b = temp;
        // this swaps the LOCAL copies a and b — has ZERO effect outside this method
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Vatsal", 1000);
        Account acc2 = new Account("Riya", 2000);

        swap(acc1, acc2);

        System.out.println(acc1);   // STILL "Vatsal" — swap had no real effect
        System.out.println(acc2);   // STILL "Riya"
    }
}

//you cannot do this in Java, for any reference type, using only method parameters — because you're always
// working with local copies of the references. This is direct, undeniable proof that Java doesn't have true
// pass-by-reference, even for objects.