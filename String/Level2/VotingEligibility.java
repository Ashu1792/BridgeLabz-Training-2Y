package Level2;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generates age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array of age and status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("-----------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println("S" + (i + 1) + "\t" + table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // Step 1: Generate random ages
        int[] ages = generateRandomAges(n);

        // Step 2: Check voting eligibility
        String[][] eligibilityTable = checkVotingEligibility(ages);

        // Step 3: Display results
        displayTable(eligibilityTable);

        scanner.close();
    }
}