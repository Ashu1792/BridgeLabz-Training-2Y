import java.util.Scanner;

public class sununtilzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double val;
        do {
            val = sc.nextDouble();
            total += val;
        } while (val != 0);
        System.out.println("Total sum is " + total);
    }
}