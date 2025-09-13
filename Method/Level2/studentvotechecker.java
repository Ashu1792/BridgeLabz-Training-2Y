package Level2;

import java.util.Scanner;

public class studentvotechecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        } else if (age >= 18) {
            return true; // eligible
        } else {
            return false; // underage
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentvotechecker checker = new studentvotechecker();

        int[] ages = new int[10]; // store ages of 10 students

        // Input loop
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            boolean eligible = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age.");
            } else if (eligible) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote ❌");
            }
        }

        sc.close();
    }
}
