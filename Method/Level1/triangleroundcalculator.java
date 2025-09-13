import java.util.Scanner;

public class triangleroundcalculator {

    // Method to calculate number of rounds needed to complete 5 km
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToCover = 5000; // 5 km in meters
        return (int) Math.ceil(distanceToCover / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the three sides of the triangle
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate and display the number of rounds
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 kilometers.");

        scanner.close();
    }
}