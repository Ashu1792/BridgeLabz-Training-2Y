package Level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method that generates the exception (no handling)
    public static void generateException(String text) {
        // Start index > end index triggers IllegalArgumentException
        System.out.println("Substring (5, 2): " + text.substring(5, 2));
    }

    // Method that handles the exception using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Substring (5, 2): " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.println("\n🔍 Demonstrating unhandled exception:");
        try {
            generateException(input); // Will crash unless caught
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🛡️ Handling exception gracefully:");
        handleException(input); // Will catch and handle the exception

        scanner.close();
    }
}