import java.util.Scanner;

public class StringIndexDemo {

    // Method that generates the exception (no handling)
    public static void generateException(String text) {
        // Accessing index beyond the string length
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        // This will throw StringIndexOutOfBoundsException
    }

    // Method that handles the exception using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.println("\n🔍 Demonstrating unhandled exception:");
        try {
            generateException(input); // This will crash unless caught
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🛡️ Handling exception gracefully:");
        handleException(input); // This will catch and handle the exception

        scanner.close();
    }
}