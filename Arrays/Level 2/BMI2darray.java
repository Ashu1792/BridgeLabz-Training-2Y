import java.util.Scanner;

public class BMI2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height and weight for person " + (i + 1));
            double h = sc.nextDouble();
            double w = sc.nextDouble();

            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][0] + ", Weight=" + personData[i][1] + ", BMI=" + personData[i][2] + ", Status=" + weightStatus[i]);
        }
    }
}