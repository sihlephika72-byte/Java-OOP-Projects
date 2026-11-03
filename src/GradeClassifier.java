public class GradeClassifier {

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

        /*
         * Test Runs for 3.1 (Recorded results):
         * mark = 45  -> Result for mark 45: Fail
         * mark = 50  -> Result for mark 50: Pass
         * mark = 63  -> Result for mark 63: Merit
         * mark = 75  -> Result for mark 75: Distinction
         * mark = 100 -> Result for mark 100: Distinction
         */

        // 3.2
        int mathematics = 72;
        int computerScience = 55;
        int attendance = 90;

        if (mathematics >= 60 && computerScience >= 60 && checkAttendance()) {
            System.out.println("Scholarship approved.");
        } else {
            System.out.println("Scholarship denied.");
        }

        /*
         * 3.2 SHORT-CIRCUIT EXPLANATION:
         * "Checking attendance..." DOES NOT get printed.
         * The && operator short-circuits as soon as it encounters an expression that
         * evaluates to false. Here, (computerScience >= 60) is false (55 >= 60 is false).
         * Because false && anything is always false, Java skips evaluating the third
         * condition completely, so checkAttendance() is never called.
         */

        // 3.3
        double rawScore = 312.87;


        byte clampedScore = (byte) rawScore;
        System.out.printf("Raw score      : %.2f%n", rawScore);
        System.out.printf("Clamped (bad)  : %d%n", clampedScore);


        double clampedValue = Math.max(0.0, Math.min(127.0, rawScore));
        byte safeScore = (byte) clampedValue;
        System.out.printf("Safe score     : %d%n", safeScore);

        /*
         * 3.3 BYTE CASTING EXPLANATION:
         * When casting (byte) 312.87, Java first drops the decimal part, leaving integer 312.
         * A byte is an 8-bit signed integer (-128 to 127). Java retains only the lower 8 bits
         * of the binary representation:
         * 312 in 32-bit binary is 00000000 00000000 00000001 00111000.
         * Truncating to the lowest 8 bits gives 00111000, which in decimal is 56.
         * Java does not clamp values automatically; it truncates high-order bits.
         */
    }
}