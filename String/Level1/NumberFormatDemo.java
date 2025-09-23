package Level1;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method that generates the exception (no handling)
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method that handles the exception using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string to parse as integer: ");
        String input = scanner.next();

        System.out.println("\n🔍 Demonstrating unhandled exception:");
        try {
            generateException(input); // Will crash unless caught
        } catch (NumberFormatException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🛡️ Handling exception gracefully:");
        handleException(input); // Will catch and handle the exception

        scanner.close();
    }
}