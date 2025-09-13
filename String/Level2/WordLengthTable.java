import java.util.Scanner;

public class WordLengthTable {

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

        // Count spaces to determine number of words
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

    // Method to create a 2D array with word and its length
    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(manualLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Split and build table
        String[] words = manualSplit(input);
        String[][] table = wordLengthTable(words);

        // Display results in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        scanner.close();
    }
}