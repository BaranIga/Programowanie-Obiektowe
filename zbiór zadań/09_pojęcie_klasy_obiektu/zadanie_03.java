public class BankAccount {
    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20);
        System.out.println(bankAccount.balance);
        bankAccount.deposit(15.21);
        System.out.println(bankAccount.balance);
        bankAccount.withdraw(5.84);
        System.out.println(bankAccount.balance);
    }

}
