package Level3;
import java.util.Random;

public class calculatezarabonus {

    // Method to generate random salary and years of service
    public static int[][] generateEmployeesData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary: 10000 to 99999
            int years = 1 + rand.nextInt(15); // years of service: 1 to 15
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] employeesData) {
        int numEmployees = employeesData.length;
        double[][] newData = new double[numEmployees][3]; // [oldSalary, bonus, newSalary]

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeesData[i][0];
            int years = employeesData[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus;
            newData[i][0] = oldSalary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }

        return newData;
    }

    // Method to calculate totals and display table
    public static void displayTable(double[][] employeeBonusData, int[][] employeesData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("EmpID\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < employeeBonusData.length; i++) {
            double oldSalary = employeeBonusData[i][0];
            double bonus = employeeBonusData[i][1];
            double newSalary = employeeBonusData[i][2];
            int years = employeesData[i][1];

            System.out.printf("%d\t%.2f\t\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t \t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate random salaries and years of service
        int[][] employeesData = generateEmployeesData(numEmployees);

        // Calculate bonus and new salary
        double[][] employeeBonusData = calculateBonus(employeesData);

        // Display the table with totals
        displayTable(employeeBonusData, employeesData);
    }
}
