import java.util.Scanner;

public class WaterTariffCalculator {
    enum AccountType {
        RESIDENTIAL, COMMERCIAL, AGRICULTURAL
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the water consumed (kL): ");
        double waterConsumed = scanner.nextDouble();

        System.out.print("Enter account type (1=Residential, 2=Commercial, 3=Agricultural): ");
        int option = scanner.nextInt();

        AccountType accountType;

        // Requirement 2.1.4: Map option to enum & terminate on invalid choice
        switch (option) {
            case 1:
                accountType = AccountType.RESIDENTIAL;
                break;
            case 2:
                accountType = AccountType.COMMERCIAL;
                break;
            case 3:
                accountType = AccountType.AGRICULTURAL;
                break;
            default:
                System.out.println("Invalid option");
                scanner.close();
                return; // Prevents crash and stops bill calculation
        }

        double tierRate1 = 0.00;
        double tierRate2 = 18.50;
        double tierRate3 = 32.00;

        double costTier1 = 0.0;
        double costTier2 = 0.0;
        double costTier3 = 0.0;

        // Requirement 2.1.5: Stepped Tier Logic
        if (waterConsumed > 20) {
            costTier1 = 6 * tierRate1;      // First 6 kL
            costTier2 = 14 * tierRate2;     // Next 14 kL (units 7 to 20)
            costTier3 = (waterConsumed - 20) * tierRate3; // Above 20 kL
        } else if (waterConsumed > 6) {     // FIX: Anything over 6 kL enters Tier 2
            costTier1 = 6 * tierRate1;
            costTier2 = (waterConsumed - 6) * tierRate2;
        } else {
            costTier1 = waterConsumed * tierRate1;
        }

        double subtotal = costTier1 + costTier2 + costTier3;
        double vat = subtotal * 0.15;
        double total = subtotal + vat;

        // Requirement 2.1.7: Bitwise AND Even/Odd check
        int wholeUnits = (int) waterConsumed;
        String parity = ((wholeUnits & 1) == 0) ? "even" : "odd";

        // Requirement 2.1.8: Aligned Formatted Bill Output
        System.out.println("\n===== WATER BILL =====");
        System.out.printf("%-18s: %s%n", "Account Type", accountType);
        System.out.printf("%-18s: %.1f kL%n", "Water Used", waterConsumed);
        System.out.printf("%-18s: R %6.2f%n", "Tier 1 Cost", costTier1);
        System.out.printf("%-18s: R %6.2f%n", "Tier 2 Cost", costTier2);
        System.out.printf("%-18s: R %6.2f%n", "Tier 3 Cost", costTier3);
        System.out.printf("%-18s: R %6.2f%n", "Subtotal", subtotal);
        System.out.printf("%-18s: R %6.2f%n", "VAT (15%)", vat);
        System.out.printf("%-18s: R %6.2f%n", "Total Due", total);
        System.out.printf("%-18s: %s%n", "Unit Count", parity);

        // ==========================================
        // Question 2.2: Enum Description Switch
        // ==========================================
        System.out.println("\n--- Account Description ---");
        switch (accountType) {
            case RESIDENTIAL:
                System.out.println("Residential accounts receive basic allocation rates for household consumption.");
                break;
            case COMMERCIAL:
                System.out.println("Commercial accounts are billed for high-volume business usage.");
                break;
            case AGRICULTURAL:
                System.out.println("Agricultural accounts receive special rates for farming and irrigation.");
                break;
            default:
                System.out.println("Unknown account type.");
                break;
        }

        scanner.close();
    }
}