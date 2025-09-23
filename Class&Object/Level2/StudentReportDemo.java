package Level2;

public class StudentReportDemo {

    // Student class definition
    static class Student {
        String name;
        int rollNumber;
        int marks;

        // Constructor to initialize student attributes
        Student(String name, int rollNumber, int marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        // Method to calculate grade based on marks
        String calculateGrade() {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 60) return "C";
            else if (marks >= 40) return "D";
            else return "F";
        }

        // Method to display student details and grade
        void displayDetails() {
            System.out.println("Student Details:");
            System.out.println("Name       : " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks      : " + marks);
            System.out.println("Grade      : " + calculateGrade());
        }
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("SHIVAM", 101, 82);

        // Display student details and grade
        student1.displayDetails();
    }
}