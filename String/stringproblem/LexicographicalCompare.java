package stringproblem;

import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static String compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                return "\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.";
            } else if (c1 > c2) {
                return "\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order.";
            }
        }

        // If all characters match, shorter string comes first
        if (len1 < len2) {
            return "\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.";
        } else if (len1 > len2) {
            return "\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order.";
        } else {
            return "Both strings \"" + s1 + "\" and \"" + s2 + "\" are equal.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for both strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Compare and display result
        String result = compareStrings(str1, str2);
        System.out.println("\nResult: " + result);

        scanner.close();
    }
}