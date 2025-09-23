public class Employee {
    // Static variable shared by all employees
    private static String companyName = "TechNova Solutions";
    private static int totalEmployees = 0;

    // Final variable for immutable employee ID
    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details with instanceof check
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Invalid object. Not an Employee instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Shivam", "Legal Analyst");
        Employee e2 = new Employee(1002, "Riya", "Software Engineer");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}