import java.util.Random;
import java.util.Scanner;

public class matrixoperation2 {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // Random numbers 1-10
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row)
                System.out.printf("%.2f\t", elem);
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    // Determinant for 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // Determinant for 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
             - matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
             + matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if(det == 0) throw new ArithmeticException("Matrix is singular; inverse does not exist.");
        return new double[][] {
            { matrix[1][1]/det, -matrix[0][1]/det },
            { -matrix[1][0]/det, matrix[0][0]/det }
        };
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if(det == 0) throw new ArithmeticException("Matrix is singular; inverse does not exist.");

        double[][] inv = new double[3][3];

        inv[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])/det;
        inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1])/det;
        inv[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1])/det;

        inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])/det;
        inv[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0])/det;
        inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0])/det;

        inv[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0])/det;
        inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0])/det;
        inv[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0])/det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        double[][] matrix = createRandomMatrix(size, size);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix));

        if(size == 2) {
            System.out.println("\nDeterminant: " + determinant2x2(matrix));
            try {
                System.out.println("\nInverse:");
                displayMatrix(inverse2x2(matrix));
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else if(size == 3) {
            System.out.println("\nDeterminant: " + determinant3x3(matrix));
            try {
                System.out.println("\nInverse:");
                displayMatrix(inverse3x3(matrix));
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Only 2x2 and 3x3 matrices are supported.");
        }

        sc.close();
    }
}
