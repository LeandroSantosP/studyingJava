package domain;

public class Account {

    private final int accountNumber;
    private final String accountHolder;
    private double balance;

    public Account(int accountNumber, String holder, double initialDeposit) {
        if (initialDeposit != 0) {
            this.balance = initialDeposit;
        }
        if(initialDeposit < 0) {
            throw new IllegalArgumentException("InitialDeposit must be greater than 0!");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = holder;
    }

    public void withDrawn(double amount) {
        if(this.balance < amount) {
            throw new IllegalArgumentException("The Client doesn't have the amount available");
        }
        this.balance -= amount;
    }
    public void deposit(double amount) { this.balance += amount; }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("Account: %s, Holder: %s, Balance: %.2f", this.accountHolder, this.accountHolder, this.balance);
    }

}
