class Account1 {
    String owner;
    int balance;

    Account1(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String toString() {
        return "Account1{owner='" + owner + "', balance=" + balance + "}";
    }

    static void tryToModify(Account1 Account1, int value) {
        // Account1 parameter now points to a NEW object
        Account1 = new Account1("Rahul", 50000);

        // Modify the copied int value
        value = 9999;
    }

    public static void main(String[] args) {
        Account1 originalAccount1 = new Account1("Krupen", 30000);
        int originalValue = 100;

        tryToModify(originalAccount1, originalValue);

        System.out.println(originalAccount1);
        System.out.println(originalValue);
    }
}