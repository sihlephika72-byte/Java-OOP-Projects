import java.util.Random;

public class Question {
    static void main(String[] args) {
        Random rand = new Random();

        int snakeEyesRoll = -1;
        int boxcarsRoll = -1;
        int oddSumRoll = -1;
        int secondDieDropRoll = -1;
        int reversedRollRoll = -1;
        int tripleDoublesRoll = -1;

        int prevDie1 = -1;
        int prevDie2 = -1;

        int die2DropStreak = 0;
        int doubleStreak = 0;

        long startTime = System.currentTimeMillis();

        for (int round = 1; round <= 100; round++) {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;

            System.out.println("Round " + round + ": Die 1 = " + d1 + ", Die 2 = " + d2);

            int sum = d1 + d2;

            if (sum == 2 && snakeEyesRoll == -1) {
                snakeEyesRoll = round;
            }

            if (sum == 12 && boxcarsRoll == -1) {
                boxcarsRoll = round;
            }

            if (sum % 2 != 0 && oddSumRoll == -1) {
                oddSumRoll = round;
            }

            if (round > 1) {
                if (d2 < prevDie2) {
                    die2DropStreak++;
                } else {
                    die2DropStreak = 0;
                }

                if (die2DropStreak == 3 && secondDieDropRoll == -1) {
                    secondDieDropRoll = round;
                }

                if (d1 == prevDie2 && d2 == prevDie1 && reversedRollRoll == -1) {
                    reversedRollRoll = round;
                }
            }

            if (d1 == d2) {
                doubleStreak++;
            } else {
                doubleStreak = 0;
            }

            if (doubleStreak == 3 && tripleDoublesRoll == -1) {
                tripleDoublesRoll = round;
            }

            prevDie1 = d1;
            prevDie2 = d2;
        }

        long endTime = System.currentTimeMillis();
        double executionTimeInSeconds = (endTime - startTime) / 1000.0;

        printResult("Snake eyes", snakeEyesRoll);
        printResult("Boxcars", boxcarsRoll);
        printResult("Odd sum", oddSumRoll);
        printResult("Second die drop", secondDieDropRoll);
        printResult("Reversed roll", reversedRollRoll);
        printResult("Triple doubles", tripleDoublesRoll);

        System.out.printf("Time taken for 100 dice rolls: %.4f seconds%n", executionTimeInSeconds);
    }

    private static void printResult(String patternName, int roll) {
        if (roll != -1) {
            System.out.println(patternName + " occurred after " + roll + " rolls.");
        } else {
            System.out.println(patternName + " did not occur.");
        }
    }
}