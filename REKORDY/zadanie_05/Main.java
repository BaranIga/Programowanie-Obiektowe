public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("1234567890");
        BankAccount bankAccount2 = new BankAccount("0987654321", 250.02);

        System.out.println(bankAccount1.numerKonta() + " " + bankAccount1.saldo());
        System.out.println(bankAccount2.numerKonta() + " " + bankAccount2.saldo());
    }
}
