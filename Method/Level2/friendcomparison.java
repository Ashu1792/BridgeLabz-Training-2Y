package Level2;

import java.util.Scanner;

public class friendcomparison {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index] + " is the youngest with age " + minAge;
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index] + " is the tallest with height " + maxHeight + " cm";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        System.out.println("\n--- Results ---");
        System.out.println(findYoungest(names, ages));
        System.out.println(findTallest(names, heights));

        sc.close();
    }
}
