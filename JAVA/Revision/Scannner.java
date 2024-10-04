import java.util.Scanner;

public class Scannner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInputInt = scanner.nextInt();

        System.out.print("Enter a double: ");
        double userInputDouble = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char userInputChar = scanner.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean userInputBoolean = scanner.nextBoolean();

        System.out.print("Enter a string: ");
        String userInputString = scanner.next();

        System.out.println("\nUser inputs: ");
        System.out.println("Integer: " + userInputInt);
        System.out.println("Double: " + userInputDouble);
        System.out.println("Character: " + userInputChar);
        System.out.println("Boolean: " + userInputBoolean);
        System.out.println("String: " + userInputString);

        scanner.close();
    }
}