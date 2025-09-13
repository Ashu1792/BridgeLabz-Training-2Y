import java.util.Scanner;

public class trignometryfunc {

    // Method to calculate sine, cosine, tangent of an angle (in degrees)
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sine(%.2f°) = %.4f\n", angle, result[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, result[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, result[2]);

        sc.close();
    }
}
