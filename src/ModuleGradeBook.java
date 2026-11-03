public class ModuleGradeBook {
    public static void main(String[] args) {
        int[][] marks = {
                {72, 68, 85},
                {45, 52, 48},
                {90, 88, 94}
        };

        System.out.println("======================================");

        // Outer loop iterates through each student (row i)
        for (int i = 0; i < marks.length; i++) {
            int studentSum = 0;

            for (int j = 0; j < marks[i].length; j++) {
                studentSum += marks[i][j];
            }

            double average = (double) studentSum / marks[i].length;
            String status = (average >= 50.0) ? "Pass" : "Fail";
            System.out.printf("Student %d | Average: %6.2f | Status: %s%n", (i + 1), average, status);
        }

        System.out.println("======================================");
    }
}