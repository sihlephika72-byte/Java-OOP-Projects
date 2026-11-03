package OOP_PROJECT_1;

public class Main {
    public static void main(String[] args) {
        BankAccount1[] bankAccounts = new BankAccount1[3];
        bankAccounts[0] = new SavingsAccount("SA101", 1000.0, 0.05);
        bankAccounts[1] = new CheckAccount("CA202", 200.0, 500.0);
        bankAccounts[2] = new SavingsAccount("SA303", 500.0, 0.03);

        for (BankAccount1 account : bankAccounts) {
            System.out.println("Before: " + account);

            // Capture and display withdrawal result
            boolean success = account.withdraw(300.0);
            System.out.println("Withdraw R300.0 Successful? " + success);

            account.applyMonthlyInterest();
            System.out.println("After:  " + account);
            System.out.println("--------------------------------------------------");
        }

        System.out.println("Total Accounts Created: " + BankAccount1.getTotalAccounts());
    }
}
