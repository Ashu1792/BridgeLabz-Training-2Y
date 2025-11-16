import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void display() {
        System.out.println("  Department: " + name);
        for (Employee e : employees) {
            System.out.print("    ");
            e.display();
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void display() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.display();
        }
    }

    // Simulate deletion: remove all departments and employees
    public void deleteCompany() {
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();
        System.out.println("Company and all its departments/employees deleted.");
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice", 101));
        dev.addEmployee(new Employee("Bob", 102));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Charlie", 201));

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.display();

        // Simulate deletion
        company.deleteCompany();
    }
}
