package Level2;

import java.util.Scanner;

public class StringLengthDemo {

    // Method to find string length without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Try accessing each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception signals end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Calculate length using manual method
        int manualLen = manualLength(input);

        // Calculate length using built-in method
        int builtInLen = input.length();

        // Display results
        System.out.println("\nManual length calculation: " + manualLen);
        System.out.println("Built-in length():         " + builtInLen);
        System.out.println("Are both lengths equal?    " + (manualLen == builtInLen));

        scanner.close();
    }
}