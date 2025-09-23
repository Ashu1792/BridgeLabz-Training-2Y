package stringproblem;

import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case of each character
    public static String toggleCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32)); // Convert to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Leave other characters unchanged
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle case
        String toggled = toggleCase(input);

        // Display result
        System.out.println("Toggled Case String: " + toggled);

        scanner.close();
    }
}