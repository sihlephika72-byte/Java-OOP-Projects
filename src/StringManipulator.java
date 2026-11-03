import java.util.Scanner;
public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine().trim();

        char[] array = phrase.toCharArray();
        for (int i =0; i < array.length; i++) {
            if (i%2==0){
                array[i] = Character.toUpperCase(array[i]);
            }
            else {
                array[i] = Character.toUpperCase(array[i]);
            }
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                
            }
        }

    }
}
