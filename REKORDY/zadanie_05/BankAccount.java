public record BankAccount(int numerKonta, double saldo) {
    public BankAccount(String numerKonta) {
        this(numerKonta, 0);
    }
}
