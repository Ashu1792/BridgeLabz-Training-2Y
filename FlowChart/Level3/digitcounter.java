package Level3;

import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        // Loop to count digits
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Total digits: " + count);
        input.close();
    }
}