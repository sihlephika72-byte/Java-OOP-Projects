public class cs_4615362_t3thurq2 {
    public static void main(String[] args) {
        String encryptedMessage = "AJAVSIUFN";
        String decryptedMessage = decryptMessage(encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String decryptMessage(String encrypted) {
        char[] chars = encrypted.toCharArray();

        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        return new String(chars);
    }
}