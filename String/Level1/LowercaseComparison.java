import java.util.Scanner;

public class LowercaseComparison {

    // Method to manually convert uppercase letters to lowercase using ASCII logic
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase (ASCII 65–90), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
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
        String manualLower = manualToLowerCase(input);

        // Convert using built-in method
        String builtInLower = input.toLowerCase();

        // Compare both results
        boolean areEqual = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual lowercase conversion: " + manualLower);
        System.out.println("Built-in toLowerCase():       " + builtInLower);
        System.out.println("Are both conversions equal?   " + areEqual);

        scanner.close();
    }
}