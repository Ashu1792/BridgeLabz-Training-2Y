import java.util.Scanner;

public class collinearpoints {

    // Method to check collinearity using slope
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Using cross multiplication to avoid division by zero
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinearity using slope
        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Slope Method)");
        } else {
            System.out.println("Points are NOT collinear (Slope Method)");
        }

        // Check collinearity using area
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Area Method)");
        } else {
            System.out.println("Points are NOT collinear (Area Method)");
        }

        sc.close();
    }
}
