package Level3;

import java.util.*;

public class nochecker5 {

    // Method to find sum of proper divisors
    public static int sumOfDivisors(int number) {
        if (number <= 1) return 0;
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect number
    public static boolean isPerfect(int number) {
        return number > 1 && sumOfDivisors(number) == number;
    }

    // Method to check Abundant number
    public static boolean isAbundant(int number) {
        return number > 1 && sumOfDivisors(number) > number;
    }

    // Method to check Deficient number
    public static boolean isDeficient(int number) {
        return number > 1 && sumOfDivisors(number) < number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong number
    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\n--- Number Properties ---");
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));

        sc.close();
    }
}
