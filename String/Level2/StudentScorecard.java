package Level2;

import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores for n students
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics: 60–100
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry: 60–100
            scores[i][2] = rand.nextInt(41) + 60; // Math: 60–100
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];

            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("S" + (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int)stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2] + "%\t\t" +
                grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // Generate scores
        int[][] scores = generateScores(n);

        // Calculate stats
        double[][] stats = calculateStats(scores);

        // Assign grades
        String[] grades = assignGrades(stats);

        // Display scorecard
        displayScorecard(scores, stats, grades);

        scanner.close();
    }
}