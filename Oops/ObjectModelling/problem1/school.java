package problem1;

import java.util.*;

// Course class: Associated with multiple students
class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.name + " enrolled in " + courseName);
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

// Student class: Associated with multiple courses
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Two-way association
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

// School class: Aggregates students
class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
        System.out.println(student.name + " added to " + schoolName);
    }

    void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

// Demo class
public class school {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("SHIVAM");
        Student s2 = new Student("Aarav");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        System.out.println();
        s1.showCourses();
        System.out.println();
        c1.showEnrolledStudents();
        System.out.println();
        school.showAllStudents();
    }
}