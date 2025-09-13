import java.util.Scanner;

public class ArrayIndexDemo {

    // Method that generates the exception (no handling)
    public static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        // This will throw ArrayIndexOutOfBoundsException
    }

    // Method that handles the exception using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for array size
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        // Populate array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        System.out.println("\n🔍 Demonstrating unhandled exception:");
        try {
            generateException(names); // Will crash unless caught
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🛡️ Handling exception gracefully:");
        handleException(names); // Will catch and handle the exception

        scanner.close();
    }
}