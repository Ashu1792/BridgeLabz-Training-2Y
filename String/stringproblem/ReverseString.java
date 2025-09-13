import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string manually using charAt()
    public static String reverse(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverse(input);

        // Display result
        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }
}