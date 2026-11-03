
/*import java.util.Scanner;

public class EnergyReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] usage = new int[8];
        int total = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter usage (kWh) for room " + (i + 1) + ": ");
            usage[i] = input.nextInt();
            total += usage[i];
        }

        double average = (double) total / 8;

        int highest = usage[0];
        int highestRoom = 1;
        int lowest = usage[0];
        int lowestRoom = 1;
        int aboveAverageCount = 0;

        for (int i = 0; i < 8; i++) {
            if (usage[i] > highest) {
                highest = usage[i];
                highestRoom = i + 1;
            }
            if (usage[i] < lowest) {
                lowest = usage[i];
                lowestRoom = i + 1;
            }
            if (usage[i] > average) {
                aboveAverageCount++;
            }
        }

        System.out.println();
        System.out.println("Total usage: " + total + " kWh");
        System.out.printf("Average usage: %.2f kWh\n", average);
        System.out.println("Highest: Room " + highestRoom + " (" + highest + " kWh)");
        System.out.println("Lowest: Room " + lowestRoom + " (" + lowest + " kWh)");
        System.out.println("Rooms above average: " + aboveAverageCount);

        for (int i = 0; i < usage.length - 1; i++) {
            for (int j = 0; j < usage.length - 1 - i; j++) {
                if (usage[j] > usage[j + 1]) {
                    int temp = usage[j];
                    usage[j] = usage[j + 1];
                    usage[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted usage: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(usage[i] + " ");
        }
        System.out.println();

        System.out.print("Report: ");
        switch (aboveAverageCount) {
            case 0:
            case 1:
                System.out.println("Even usage across rooms");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Moderate variation in usage");
                break;
            default:
                System.out.println("Large variation, check the high-use rooms");
                break;
        }

        input.close();
    }
}
*/