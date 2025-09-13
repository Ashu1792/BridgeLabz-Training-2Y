import java.util.Scanner;

public class CharacterTypeTable {

    // Method to classify a character
    public static String classifyChar(char ch) {
        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to classify all characters in a string using charAt()
    public static String[][] classifyString(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = classifyChar(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Classify characters
        String[][] table = classifyString(input);

        // Display results
        displayTable(table);

        scanner.close();
    }
}