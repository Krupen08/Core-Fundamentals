interface Payment {
    void pay();
    void refund();
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Paid using Credit Card");
    }

    public void refund() {
        System.out.println("Refund to Credit Card");
    }
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Paid using UPI");
    }

    public void refund() {
        System.out.println("Refund to UPI");
    }
}

//When?
//When multiple unrelated classes should follow the same set of behaviors.
//Why?
//To achieve abstraction + loose coupling.
// Real-world use: Payment gateways, database drivers, logging systems, notification systems, etc.

public class Standard_Interface {
    public static void main(String[] args) {

        Payment p = new UPI();

        p.pay();
        p.refund();
    }
}