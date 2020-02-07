public class BankAccountClient {

    public static void main (String [] args){
        BankAccount B1 = new BankAccount("John", 1000);
        B1.deposit(500);
        System.out.println(B1.getBalance());
        B1.withdraw(300);
        System.out.println(B1);

        BankAccount B2 = new BankAccount();
        System.out.println(B2);

        //returns the amount of objects
        System.out.println("number of objects = "+ BankAccount.getCount());

    }
}
