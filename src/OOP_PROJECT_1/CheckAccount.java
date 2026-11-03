package OOP_PROJECT_1;

public class CheckAccount extends BankAccount1 {
    private double overdraftLimit;

    public CheckAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void applyMonthlyInterest() {
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) >= -overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}