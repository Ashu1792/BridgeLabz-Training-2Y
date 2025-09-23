package Level1;

public class CircleDemo {

    // Circle class definition
    static class Circle {
        double radius;

        // Constructor to initialize radius
        Circle(double radius) {
            this.radius = radius;
        }

        // Method to calculate area
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        // Method to calculate circumference
        double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        // Method to display details
        void displayDetails() {
            System.out.println("Circle Details:");
            System.out.println("Radius        : " + radius);
            System.out.println("Area          : " + calculateArea());
            System.out.println("Circumference : " + calculateCircumference());
        }
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Create a Circle object with radius 5.0
        Circle circle = new Circle(5.0);

        // Display the area and circumference
        circle.displayDetails();
    }
}