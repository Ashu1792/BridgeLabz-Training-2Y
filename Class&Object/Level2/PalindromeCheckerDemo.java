package Level2;

public class PalindromeCheckerDemo {

    // PalindromeChecker class definition
    static class PalindromeChecker {
        String text;

        // Constructor to initialize the text
        PalindromeChecker(String text) {
            this.text = text;
        }

        // Method to check if the text is a palindrome
        boolean isPalindrome() {
            String cleaned = text.replaceAll("[\\W_]", "").toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        }

        // Method to display the result
        void displayResult() {
            System.out.println("Input Text: " + text);
            if (isPalindrome()) {
                System.out.println("Result     : It's a palindrome.");
            } else {
                System.out.println("Result     : Not a palindrome.");
            }
        }
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Create a PalindromeChecker object
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");

        // Display results
        checker1.displayResult();
        System.out.println();
        checker2.displayResult();
    }
}