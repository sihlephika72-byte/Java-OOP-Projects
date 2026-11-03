package OOP_PROJECT_1;

public abstract class BankAccount1 implements Transaction {
    private String accountNumber;
    protected double balance;
    private static int totalAccounts = 0;

    public BankAccount1() {
        this.accountNumber = "UNKNOWN";
        this.balance = 0.0;
        totalAccounts++;
    }

    public BankAccount1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public abstract void applyMonthlyInterest();

    @Override
    public String toString() {
        return "[Acc #: " + accountNumber + " | Balance: R" + balance + "]";
    }
}