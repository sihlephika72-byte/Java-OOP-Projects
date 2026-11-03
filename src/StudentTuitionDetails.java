public class StudentTuitionDetails {
    public static void main(String[] args) {
        String studentName  =  "John Smith";
        long studentID  = 4636300L;
        double currentBalance = 18450.689;
        float libraryDiscount = 0.05f;
        Boolean tuitionFullyPaid = false;
        char campusCode = 'S';

        System.out.printf("Student Name: %s%n", studentName.toUpperCase());
        System.out.printf("Student ID: %d%n", studentID);
        System.out.printf("Current Balance: %.2f%n", currentBalance);
        System.out.printf("Library Discount: %.2f%n", libraryDiscount);

        final double lateFeeRate = 0.08;
        System.out.printf("Late Fee Penalty: %+,.2f%n" , currentBalance * lateFeeRate);

    }
}
