package Level2;

import java.util.Scanner;

public class WordLengthAnalysis {

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

    // Method to build a 2D array of words and their lengths
    public static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(manualLength(words[i]));
        }

        return table;
    }

    // Method to find shortest and longest word from the 2D array
    public static int[] findShortestAndLongest(String[][] table) {
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Step 1: Split into words
        String[] words = manualSplit(input);

        // Step 2: Build word-length table
        String[][] table = buildWordLengthTable(words);

        // Step 3: Find shortest and longest
        int[] result = findShortestAndLongest(table);

        // Step 4: Display results
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest word: " + table[result[0]][0] + " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word:  " + table[result[1]][0] + " (Length: " + table[result[1]][1] + ")");

        scanner.close();
    }
}