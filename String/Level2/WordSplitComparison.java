package Level2;

import java.util.Scanner;

public class WordSplitComparison {

    // Method to calculate string length without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split string into words manually using charAt()
    public static String[] manualSplit(String text) {
        int length = manualLength(text);

        // Step 1: Count spaces to determine number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        // Step 2: Extract words using space positions
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder();
                for (int j = start; j < i; j++) {
                    word.append(text.charAt(j));
                }
                words[wordIndex++] = word.toString();
                start = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
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

        // Manual split
        String[] manualWords = manualSplit(input);

        // Built-in split
        String[] builtInWords = input.split(" ");

        // Compare results
        boolean areEqual = compareArrays(manualWords, builtInWords);

        // Display results
        System.out.println("\nManual split:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both splits equal? " + areEqual);

        scanner.close();
    }
}