import java.util.Scanner;

public class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public static void printEmployeeDetails(Object obj) {
        if (obj instanceof Employee emp) {
            System.out.println("ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Object is not an Employee.");
        }
    }
    
    public static Employee inputEmployee() {
        Employee emp;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Designation: ");
            String designation = scanner.nextLine();
            emp = new Employee(id, name, designation);
        }
        return emp;
    }
    public static void main(String[] args) {
       Employee emp = Employee.inputEmployee();
       Employee.printEmployeeDetails(emp);
       Employee.displayTotalEmployees();
    }
}
