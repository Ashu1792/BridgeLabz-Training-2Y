package Level1;

public class Nullpointer {

    // Method that generates a NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method that handles the NullPointerException using try-catch
    public static void handleException() {
        String text = null;
        try {
            // Attempt to access a method on a null reference
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("🔍 Demonstrating NullPointerException:");
        try {
            generateException(); // This will crash unless caught
        } catch (NullPointerException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🛡️ Handling NullPointerException gracefully:");
        handleException(); // This will catch and handle the exception
    }
}