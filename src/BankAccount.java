public class BankAccount {
    // 1. "private" hides data; "final" ensures the account number can NEVER change
    private final String accountNumber;

    // "private" protects the balance from direct outside modification
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        // 2. "this" resolves ambiguity between the fields above and the parameters below
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Public Getter method allows safe reading of private data
    public double getBalance() {
        return this.balance;
    }

    // Public method allows controlled modification of private data
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // Updates the current object's balance
        }
    }
}
