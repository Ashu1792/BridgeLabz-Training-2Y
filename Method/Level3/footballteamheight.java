package Level3;

import java.util.Arrays;

public class footballteamheight {

    // Method to calculate sum of array elements
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights between 150–250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150–250
        }

        // Display all heights
        System.out.println("Heights of players: " + Arrays.toString(heights));

        // Compute results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Sum of Heights = " + sum + " cm");
        System.out.println("Mean Height = " + mean + " cm");
        System.out.println("Shortest Height = " + shortest + " cm");
        System.out.println("Tallest Height = " + tallest + " cm");
    }
}
