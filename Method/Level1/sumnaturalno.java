import java.util.Scanner;

public class sumnaturalno {

    // Method to calculate sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;   // Add each number
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = findSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }

        sc.close();
    }
}
