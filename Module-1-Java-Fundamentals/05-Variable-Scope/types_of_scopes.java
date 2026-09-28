//                    1. Block scope (the smallest):
/*
public static void main(String[] args) {
    if (true) {
        int x = 5;   // x is born here
        System.out.println(x);   // valid, x exists here
    }
    // x does NOT exist here anymore — the block { } it was born in has ended
    // System.out.println(x);  <- this would be a COMPILE ERROR
}

 */

//                      2. Local (method) scope:

/*

public static void greet() {
    String message = "Hello";   // local variable, lives only inside greet()
    System.out.println(message);
}
// message does not exist outside greet() at all

 */

//                      3. Instance (field) scope:

/*

public class Account {
    private double balance;   // instance variable — lives as long as the OBJECT lives

    public void deposit(double amount) {
        balance += amount;   // accessible from any method in this class
    }
}

 */

//                      4. Class (static) scope (the largest/longest-lived):

/*
public class Counter {
    static int totalCount = 0;   // static variable — shared by ALL objects of this class

    public Counter() {
        totalCount++;
    }
}

 */


// Variable Shadowing
/*

public class ShadowDemo {
    static int value = 100;   // class-level (static) scope

    public static void main(String[] args) {
        int value = 5;   // LOCAL variable, same name!
        System.out.println(value);   // prints 5 — the LOCAL one wins
        System.out.println(ShadowDemo.value);   // prints 100 — explicitly reach the static one
    }
}
 */
