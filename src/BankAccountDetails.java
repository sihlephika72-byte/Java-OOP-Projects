public class BankAccountDetails {
    public static void main(String[] args) {
        // 1.1
        String accountHolder = "John Doe";
        long accountNumber = 4028671903L;
        double balance = 15432.756;
        float interestRate = 4.25f;
        boolean isActive = true;
        char accountType = 'S';

        System.out.println("ACCOUNT HOLDER: " + accountHolder.toUpperCase());
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Active: " + isActive);


        int byteDifference = Double.BYTES - Float.BYTES;
        System.out.println("A double uses " + byteDifference + " more bytes of memory than a float.");

        // 1.2
        final double TAX_RATE = 0.15;
        double taxOwed = balance * TAX_RATE;
        System.out.printf("Tax owed: %+,.2f%n", taxOwed);

        // 1.3
        // final double TAX_RATE = 0.20;
    }
}

/*
 * Explanation for 1.3:
 *
 * Attempting to declare a second variable with the same name 'TAX_RATE' inside the same scope (method)
 * causes a SYNTAX ERROR (specifically a compile-time error: "variable TAX_RATE is already defined").
 *
 * Java does not allow duplicate variable identifiers within the same scope regardless of the 'final' keyword.
 * Even though both declarations use 'final' correctly on their own, a local variable name must be unique
 * in its enclosing block to prevent ambiguity.
 */