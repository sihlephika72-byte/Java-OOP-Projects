
import java.util.Scanner;

public class cs_4615362_t3thurq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First word: ");
        String word1 = scanner.next();

        System.out.print("Second word: ");
        String word2 = scanner.next();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        sortArray(arr1);
        sortArray(arr2);

        boolean sameDNA = compareArrays(arr1, arr2);

        if (sameDNA) {
            System.out.println(word1 + " and " + word2 + " have the same Word DNA.");
        } else {
            System.out.println(word1 + " and " + word2 + " do not have the same Word DNA.");
        }

        scanner.close();
    }

    public static void sortArray(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}