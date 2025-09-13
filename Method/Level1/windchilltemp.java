import java.util.Scanner;

public class windchilltemp {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature 
               + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter temperature (Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();

        // Wind chill formula is valid only if temp <= 50F and windSpeed > 3 mph
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill formula is valid only for temperature <= 50F and wind speed > 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }

        sc.close();
    }
}
