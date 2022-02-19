package  Feb9HandsOn.Ques2;


public class Main {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a. deposit(100);
        b. deposit(150);
        c. deposit(200);
        System.out.println("Balance of Bank A = ₹"+a.getBalance());
        System.out.println("Balance of Bank B = ₹"+b.getBalance());
        System.out.println("Balance of Bank C = ₹"+c.getBalance());
    }
}