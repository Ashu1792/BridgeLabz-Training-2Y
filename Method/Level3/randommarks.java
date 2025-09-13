import java.util.Random;
import java.util.Scanner;

public class randommarks {

    // Method to generate random scores for Physics, Chemistry, Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics (10-99)
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry
            scores[i][2] = 10 + rand.nextInt(90); // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        sc.close();
    }
}
