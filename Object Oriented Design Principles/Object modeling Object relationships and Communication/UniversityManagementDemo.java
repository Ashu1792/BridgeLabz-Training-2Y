import java.util.*;

class Professor {
    private final String name;
    private final List<UMSCourse> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(UMSCourse course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this); // maintain association both ways
        }
    }

    public List<UMSCourse> getCourses() {
        return courses;
    }

    public void showCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (UMSCourse c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

class UMSStudent {
    private final String name;
    private final List<UMSCourse> courses;

    public UMSStudent(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(UMSCourse course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // maintain association both ways
        }
    }

    public List<UMSCourse> getCourses() {
        return courses;
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (UMSCourse c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

class UMSCourse {
    private final String name;
    private Professor professor;
    private final List<UMSStudent> students;

    public UMSCourse(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        if (!professor.getCourses().contains(this)) {
            professor.assignCourse(this);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void enrollStudent(UMSStudent student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<UMSStudent> getStudents() {
        return students;
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (UMSStudent s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        // Professors
    Professor profSmith = new Professor("Smith");
    Professor profJones = new Professor("Jones");

    // Students
    UMSStudent alice = new UMSStudent("Alice");
    UMSStudent bob = new UMSStudent("Bob");
    UMSStudent charlie = new UMSStudent("Charlie");

    // Courses
    UMSCourse math = new UMSCourse("Mathematics");
    UMSCourse physics = new UMSCourse("Physics");
    UMSCourse history = new UMSCourse("History");

    // Assign professors to courses
    profSmith.assignCourse(math);
    profSmith.assignCourse(physics);
    profJones.assignCourse(history);

    // Students enroll in courses
    alice.enrollCourse(math);
    alice.enrollCourse(physics);
    bob.enrollCourse(physics);
    bob.enrollCourse(history);
    charlie.enrollCourse(math);
    charlie.enrollCourse(history);

    // Show professor-course relationships
    profSmith.showCourses();
    profJones.showCourses();
    System.out.println();

    // Show student-course relationships
    alice.showCourses();
    bob.showCourses();
    charlie.showCourses();
    System.out.println();

    // Show students in each course
    math.showStudents();
    physics.showStudents();
    history.showStudents();
    }
}
