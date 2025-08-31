package Level3;

import java.util.Scanner;

class HarshadChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Sum of digits
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        // Check Harshad condition
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        input.close();
    }
}