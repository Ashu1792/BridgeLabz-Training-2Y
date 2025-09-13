package Level2;

import java.util.Scanner;

public class noanalysis {

    // Method to check if number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else {
                System.out.println("Number " + num + " is Negative");
            }
        }

        // Compare first and last numbers
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\n--- First vs Last ---");
        if (result == 0) {
            System.out.println("First number (" + numbers[0] + ") is equal to Last number (" + numbers[4] + ")");
        } else if (result == 1) {
            System.out.println("First number (" + numbers[0] + ") is greater than Last number (" + numbers[4] + ")");
        } else {
            System.out.println("First number (" + numbers[0] + ") is less than Last number (" + numbers[4] + ")");
        }

        sc.close();
    }
}
