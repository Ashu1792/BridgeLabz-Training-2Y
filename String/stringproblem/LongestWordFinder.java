import java.util.Scanner;

public class LongestWordFinder {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take sentence input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Find longest word
        String longestWord = findLongestWord(input);

        // Display result
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }
}