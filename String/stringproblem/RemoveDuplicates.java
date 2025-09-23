package stringproblem;

import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII character tracking

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates
        String modified = removeDuplicates(input);

        // Display result
        System.out.println("Modified String (no duplicates): " + modified);

        scanner.close();
    }
}