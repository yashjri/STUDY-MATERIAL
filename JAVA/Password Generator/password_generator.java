import java.util.Random;
import java.util.Scanner;

public class password_generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int passwordLength = scanner.nextInt();

        String characterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_";

        String generatedPassword = generatePassword(passwordLength, characterSet);

        System.out.println("Generated Password: " + generatedPassword);

        scanner.close();
    }

    public static String generatePassword(int length, String charset) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charset.length());
            password.append(charset.charAt(index));
        }
        return password.toString();
    }
}