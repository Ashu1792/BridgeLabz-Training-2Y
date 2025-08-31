package Level3;

import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get year input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year >= 1582) {
            // Check leap year conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later.");
        }

        // Close Scanner
        input.close();
    }
}