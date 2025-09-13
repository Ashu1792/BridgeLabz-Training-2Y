import java.util.Random;
import java.util.Scanner;

public class matrixoperation {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random integers 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication not possible: columns of A must equal rows of B");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows and columns of first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        // Generate random matrices
        int[][] mat1 = createRandomMatrix(rows1, cols1);
        int[][] mat2 = createRandomMatrix(rows2, cols2);

        System.out.println("\nMatrix A:");
        displayMatrix(mat1);

        System.out.println("\nMatrix B:");
        displayMatrix(mat2);

        // Perform addition and subtraction if dimensions match
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] sum = addMatrices(mat1, mat2);
            int[][] diff = subtractMatrices(mat1, mat2);

            System.out.println("\nMatrix A + B:");
            displayMatrix(sum);

            System.out.println("\nMatrix A - B:");
            displayMatrix(diff);
        } else {
            System.out.println("\nAddition and Subtraction not possible due to different dimensions.");
        }

        // Perform multiplication if columns of A == rows of B
        if (cols1 == rows2) {
            int[][] product = multiplyMatrices(mat1, mat2);
            System.out.println("\nMatrix A * B:");
            displayMatrix(product);
        } else {
            System.out.println("\nMultiplication not possible: columns of A must equal rows of B.");
        }

        sc.close();
    }
}
