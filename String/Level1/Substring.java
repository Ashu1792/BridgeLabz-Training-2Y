package Level1;

import java.util.Scanner;

public class Substring {

    // Method to create a substring using charAt()
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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

        // Take input string and indices
        System.out.print("Enter the original string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Create substrings
        String manualSub = manualSubstring(input, start, end);
        String builtInSub = input.substring(start, end);

        // Compare substrings
        boolean comparisonResult = compareUsingCharAt(manualSub, builtInSub);

        // Display results
        System.out.println("\nManual substring using charAt(): " + manualSub);
        System.out.println("Built-in substring(): " + builtInSub);
        System.out.println("Are both substrings equal (char-by-char)? " + comparisonResult);

        scanner.close();
    }
}