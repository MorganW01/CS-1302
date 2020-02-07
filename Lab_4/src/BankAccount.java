public class BankAccount {
    private String name;
    private double balance;
    private static int numObjects;

//CONSTRUCTORS

    // constructor 1, sets name and balance to parameters passed.
    BankAccount(String name, double balance) {
        numObjects++;
        this.name = name;
        this.balance = balance;
    }

    //constructor 2,sets name to null and balance to 0.
    BankAccount() {
        numObjects++;
        name = null;
        balance = 0.0;
    }

//METHODS

    public static int getCount() {
        return numObjects;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public String toString() {
        return name + ", " + balance;
    }

}
