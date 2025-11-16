import java.util.*;

class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // maintain association both ways
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        school.addStudent(alice);
        school.addStudent(bob);
        school.addStudent(charlie);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(science);
        bob.enrollInCourse(history);
        charlie.enrollInCourse(math);
        charlie.enrollInCourse(history);

        // Show students in school
        school.showStudents();
        System.out.println();

        // Show courses for each student
        alice.showCourses();
        bob.showCourses();
        charlie.showCourses();
        System.out.println();

        // Show students enrolled in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        history.showEnrolledStudents();
    }
}
