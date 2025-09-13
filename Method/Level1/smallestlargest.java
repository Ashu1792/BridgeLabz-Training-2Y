import java.util.Scanner;

public class smallestlargest {

    // Method to find smallest and largest
    public static void findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        // Check for smallest
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        // Check for largest
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        // Print results
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Call method
        findSmallestAndLargest(num1, num2, num3);

        sc.close();
    }
}
