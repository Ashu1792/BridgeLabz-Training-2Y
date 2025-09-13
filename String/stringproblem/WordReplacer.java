import java.util.Scanner;

public class WordReplacer {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(target)) {
                result.append(replacement);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input sentence and words
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String target = scanner.next();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.next();

        // Replace and display result
        String modified = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + modified);

        scanner.close();
    }
}