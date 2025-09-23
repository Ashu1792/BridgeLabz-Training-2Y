package Level1;

public class EmployeeDemo {

    // Employee class definition
    static class Employee {
        String name;
        int id;
        double salary;

        // Constructor to initialize attributes
        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        // Method to display employee details
        void displayDetails() {
            System.out.println("Employee Details:");
            System.out.println("Name   : " + name);
            System.out.println("ID     : " + id);
            System.out.println("Salary : ₹" + salary);
        }
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee("SHIVAM", 1001, 85000.00);

        // Display the employee's details
        emp1.displayDetails();
    }
}