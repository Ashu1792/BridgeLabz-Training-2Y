import java.util.Scanner;

public class UppercaseComparison {

    // Method to manually convert lowercase letters to uppercase using ASCII logic
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase (ASCII 97–122), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else {
                result.append(ch); // Leave other characters unchanged
            }
        }

        return result.toString();
    }

    // Method to compare two strings character-by-character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Convert using manual method
        String manualUpper = manualToUpperCase(input);

        // Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Compare both results
        boolean areEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual uppercase conversion: " + manualUpper);
        System.out.println("Built-in toUpperCase():       " + builtInUpper);
        System.out.println("Are both conversions equal?   " + areEqual);

        scanner.close();
    }
}