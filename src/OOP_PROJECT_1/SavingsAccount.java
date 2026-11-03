package OOP_PROJECT_1;

public class SavingsAccount extends BankAccount1 {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyMonthlyInterest() {
        balance += balance * interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) >= 100.0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " | Interest Rate: " + interestRate;
    }
}