import java.util.Scanner;

public class ElectricityBillCalculator {

    // Requirement 2.1.2: Enum declaration
    enum MeterType {
        PREPAID,
        POSTPAID,
        SOLAR
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units used (kWh): ");
        double units = scanner.nextDouble();

        System.out.print("Enter meter type (1=PREPAID, 2=POSTPAID, 3=SOLAR): ");
        int typeChoice = scanner.nextInt();

        MeterType meterType;
        switch (typeChoice) {
            case 1:
                meterType = MeterType.PREPAID;
                break;
            case 2:
                meterType = MeterType.POSTPAID;
                break;
            case 3:
                meterType = MeterType.SOLAR;
                break;
            default:
                System.out.print("Invalid meter type");
                scanner.close();
                return;
        }

        double tier1Cost ;
        double tier2Cost = 0.0;
        double tier3Cost = 0.0;

        if (units > 100) {
            tier1Cost = 50 * 1.50;
            tier2Cost = 50 * 2.10;
            tier3Cost = (units - 100) * 2.85;
        } else if (units > 50) {
            tier1Cost = 50 * 1.50;
            tier2Cost = (units - 50) * 2.10;
        } else {
            tier1Cost = units * 1.50;
        }

        double subtotal = tier1Cost + tier2Cost + tier3Cost;
        double vat = subtotal * 0.15;
        double totalDue = subtotal + vat;

        int wholeUnits = (int) units;
        String parity = ((wholeUnits & 1) == 0) ? "even" : "odd";

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.printf("%-13s: %s%n", "Meter type", meterType);
        System.out.printf("%-13s: %.1f%n", "Units used", units);
        System.out.printf("%-13s: R %6.2f%n", "Tier 1 cost", tier1Cost);
        System.out.printf("%-13s: R %6.2f%n", "Tier 2 cost", tier2Cost);
        System.out.printf("%-13s: R %6.2f%n", "Tier 3 cost", tier3Cost);
        System.out.printf("%-13s: R %6.2f%n", "Subtotal", subtotal);
        System.out.printf("%-13s: R %6.2f%n", "VAT (15%)", vat);
        System.out.printf("%-13s: R %6.2f%n", "Total due", totalDue);
        System.out.printf("%-13s: %s%n", "Unit count", parity);

        // ==========================================
        // Question 2.2: Enum Description Switch
        // ==========================================
        System.out.print("\n--- Meter Description ---");
        switch (meterType) {
            case PREPAID:
                System.out.print("Prepaid meters require users to pay for electricity before consumption.");
                break;
            case POSTPAID:
                System.out.print("Postpaid meters record usage and bill the customer at the end of the month.");
                break;
            case SOLAR:
                System.out.print("Solar meters receive a feed-in credit for excess generation.");
                break;
            default:
                // A default case is good practice here defensive-programming-wise because if new constants
                // are added to the MeterType enum in the future, the compiler will not force a runtime crash,
                // and any unexpected enum value will be handled gracefully without silent failure.
                System.out.print("Unknown meter type selected.");
                break;
        }

        scanner.close();
    }

    /*
     ========================================================================================
     Question 2.3 Answer (Explanation Comment):
     ========================================================================================
     1. Error Type:
        Reading 3,000,000,000 into an int causes an InputMismatchException at runtime when using
        Scanner.nextInt(), or an integer overflow / compile error if assigned as a literal.

     2. What happens to the value:
        The maximum value an integer (`int`) can store in Java is 2,147,483,647 (2^31 - 1).
        Since 3,000,000,000 exceeds Integer.MAX_VALUE, reading it directly via nextInt() crashes
        with an InputMismatchException. If explicit narrowing arithmetic forced this fit,
        it would wrap around to a negative number due to two's complement overflow.

     3. Rewritten Declaration:
        long units = scanner.nextLong(); // Primitive 'long' supports up to 9,223,372,036,854,775,807
     ========================================================================================
    */
}
/*public class GradeClassifier {

    public static boolean checkAttendance() {
        System.out.println("Checking attendance...");
        return true;
    }

    public static void main(String[] args) {
        // 3.1
        int mark = 78;

        String result = (mark >= 75) ? "Distinction" :
                (mark >= 60) ? "Merit" :
                        (mark >= 50) ? "Pass" : "Fail";

        System.out.printf("Result for mark %d: %s%n", mark, result);


         * Test Runs for 3.1 (Recorded results):
         * mark = 45  -> Result for mark 45: Fail
         * mark = 50  -> Result for mark 50: Pass
         * mark = 63  -> Result for mark 63: Merit
         * mark = 75  -> Result for mark 75: Distinction
         * mark = 100 -> Result for mark 100: Distinction


// 3.2
int mathematics = 72;
int computerScience = 55;
int attendance = 90;

        if (mathematics >= 60 && computerScience >= 60 && checkAttendance()) {
        System.out.println("Scholarship approved.");
        } else {
                System.out.println("Scholarship denied.");
        }


 * 3.2 SHORT-CIRCUIT EXPLANATION:
 * "Checking attendance..." DOES NOT get printed.
 * The && operator short-circuits as soon as it encounters an expression that
 * evaluates to false. Here, (computerScience >= 60) is false (55 >= 60 is false).
 * Because false && anything is always false, Java skips evaluating the third
 * condition completely, so checkAttendance() is never called.


// 3.3
double rawScore = 312.87;


byte clampedScore = (byte) rawScore;
        System.out.printf("Raw score      : %.2f%n", rawScore);
        System.out.printf("Clamped (bad)  : %d%n", clampedScore);


double clampedValue = Math.max(0.0, Math.min(127.0, rawScore));
byte safeScore = (byte) clampedValue;
        System.out.printf("Safe score     : %d%n", safeScore);


 * 3.3 BYTE CASTING EXPLANATION:
 * When casting (byte) 312.87, Java first drops the decimal part, leaving integer 312.
 * A byte is an 8-bit signed integer (-128 to 127). Java retains only the lower 8 bits
 * of the binary representation:
 * 312 in 32-bit binary is 00000000 00000000 00000001 00111000.
 * Truncating to the lowest 8 bits gives 00111000, which in decimal is 56.
 * Java does not clamp values automatically; it truncates high-order bits.
 */