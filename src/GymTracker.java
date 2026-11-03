public class GymTracker {
    public static void main(String[] args) {
        int[] dailyMinutes = {
                45, 60, 0, 50, 75, 0, 90
        };

        int total = 0;
        for (int minute : dailyMinutes) {
            total += minute;
        }

        double average = (double) total / dailyMinutes.length;

        for (int i = 0; i < dailyMinutes.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + dailyMinutes[i] + " min");
        }

        System.out.printf("Total Minutes: %d min%n", total);
        System.out.printf("Average Duration: %.2f min%n", average);

        try {
            System.out.println(dailyMinutes[7]); // Intentionally out of bounds
        } catch (ArithmeticException e) {
            System.out.println("Math error occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid day index accessed!");
        } catch (Exception e) {
            System.out.println("A generic error occurred.");
        }
    }
}