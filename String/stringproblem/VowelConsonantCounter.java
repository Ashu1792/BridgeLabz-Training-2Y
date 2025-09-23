package stringproblem;

import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsConsonants(input);

        // Display result
        System.out.println("\nVowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        scanner.close();
    }
}