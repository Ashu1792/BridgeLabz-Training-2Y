import java.util.Scanner;

public class euclideandistance {

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line (slope and y-intercept)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope, intercept;
        if (x2 - x1 != 0) {  // Avoid division by zero
            slope = (y2 - y1) / (x2 - x1);
            intercept = y1 - slope * x1;
        } else {
            // Vertical line: slope is undefined, set to Double.POSITIVE_INFINITY
            slope = Double.POSITIVE_INFINITY;
            intercept = Double.NaN; // y-intercept does not exist for v5 6ertical line
        }
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two points
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between the points: %.4f\n", distance);

        // Calculate line equation
        double[] line = calculateLineEquation(x1, y1, x2, y2);
        if (Double.isInfinite(line[0])) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.4f * x + %.4f\n", line[0], line[1]);
        }

        sc.close();
    }
}
