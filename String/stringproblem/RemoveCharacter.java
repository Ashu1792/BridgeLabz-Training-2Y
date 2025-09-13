import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a specific character
    public static String removeChar(String text, char target) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != target) {
                result.append(text.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Take character to remove
        System.out.print("Enter the character to remove: ");
        char target = scanner.next().charAt(0);

        // Remove character and display result
        String modified = removeChar(input, target);
        System.out.println("Modified String: " + modified);

        scanner.close();
    }
}