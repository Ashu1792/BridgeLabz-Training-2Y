import java.util.Scanner;

public class ManualTrimDemo {

    // Method to find start and end index excluding leading/trailing spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end + 1 }; // end is exclusive
    }

    // Method to create substring using charAt()
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
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
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = scanner.nextLine();

        // Step 1: Find trim indices
        int[] indices = findTrimIndices(input);

        // Step 2: Create manually trimmed substring
        String manualTrimmed = manualSubstring(input, indices[0], indices[1]);

        // Step 3: Use built-in trim()
        String builtInTrimmed = input.trim();

        // Step 4: Compare both results
        boolean areEqual = compareStrings(manualTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nManual Trimmed String: \"" + manualTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trims equal? " + areEqual);

        scanner.close();
    }
}