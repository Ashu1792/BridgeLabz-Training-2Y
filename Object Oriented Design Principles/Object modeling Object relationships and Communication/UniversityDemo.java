import java.util.*;

class UniDepartment {
    private final String name;

    public UniDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private final String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private final String name;
    private final List<UniDepartment> departments;
    private final List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University owns Departments
    public void addDepartment(String deptName) {
        departments.add(new UniDepartment(deptName));
    }

    public List<UniDepartment> getDepartments() {
        return departments;
    }

    // Aggregation: University has Faculties
    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    // Simulate deleting University (composition)
    public void deleteUniversity() {
        departments.clear(); // all departments deleted
        faculties.clear();   // faculties removed from university, but not deleted
        System.out.println("University '" + name + "' deleted. All departments removed.");
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Tech University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        uni.addDepartment("Physics");

        Faculty alice = new Faculty("Alice");
        Faculty bob = new Faculty("Bob");
        Faculty charlie = new Faculty("Charlie");

        uni.addFaculty(alice);
        uni.addFaculty(bob);

        System.out.println("Departments in " + uni.getDepartments().size() + ":");
        for (UniDepartment d : uni.getDepartments()) {
            System.out.println("- " + d.getName());
        }
        System.out.println();

        System.out.println("Faculties in university:");
        for (Faculty f : uni.getFaculties()) {
            System.out.println("- " + f.getName());
        }
        System.out.println();

        // Faculty can exist outside university
        System.out.println("Faculty member outside university: " + charlie.getName());
        System.out.println();

        // Delete university (composition)
        uni.deleteUniversity();
        System.out.println("Departments after university deletion: " + uni.getDepartments().size());
        System.out.println("Faculties after university deletion: " + uni.getFaculties().size());
    }
}
