package Level3;

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        // Calculate average
        double average = (physics + chemistry + maths) / 3.0;

        // Display average
        System.out.println("Average Marks: " + average);

        // Determine grade
        if (average >= 90) {
            System.out.println("Grade: A+ | Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: A | Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: B | Good");
        } else if (average >= 50) {
            System.out.println("Grade: C | Satisfactory");
        } else {
            System.out.println("Grade: F | Needs Improvement");
        }

        input.close();
    }
}