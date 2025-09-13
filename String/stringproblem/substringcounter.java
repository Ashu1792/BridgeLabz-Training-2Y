package stringproblem;

import java.util.Scanner;

public class SubstringCounter {

    // Method to count occurrences of a substring in a string
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int textLength = text.length();
        int subLength = sub.length();

        for (int i = 0; i <= textLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string and substring
        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = scanner.nextLine();

        // Count and display result
        int occurrences = countOccurrences(text, sub);
        System.out.println("Occurrences of \"" + sub + "\": " + occurrences);

        scanner.close();
    }
}