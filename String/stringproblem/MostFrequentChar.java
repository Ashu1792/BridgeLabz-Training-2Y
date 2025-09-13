import java.util.Scanner;

public class MostFrequentChar {

    // Method to find the most frequent character
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; // ASCII character frequency

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int maxFreq = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find and display most frequent character
        char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");

        scanner.close();
    }
}