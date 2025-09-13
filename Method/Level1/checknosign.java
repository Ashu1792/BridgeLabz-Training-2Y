import java.util.Scanner;

public class checknosign {

    // Method to check the sign of a number
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check and display result
        int result = checkNumber(number);
        switch (result) {
            case 1:
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
        }

        scanner.close();
    }
}