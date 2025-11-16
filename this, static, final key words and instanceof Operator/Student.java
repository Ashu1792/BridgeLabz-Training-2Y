public class Student {

    public static String universityName = "Your University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    public static void displayStudentDetails(Object obj) {
        if (obj instanceof Student s) {
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Object is not a Student instance.");
        }
    }

    public static void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student s) {
            s.grade = newGrade;
            System.out.println("Grade updated to: " + s.grade);
        } else {
            System.out.println("Object is not a Student instance.");
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

        public static Student createStudentFromInput() {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();
            return new Student(name, rollNumber, grade);
        }

            // Main method for demonstration
            public static void main(String[] args) {
                Student s = Student.createStudentFromInput();
                Student.displayStudentDetails(s);
                Student.displayTotalStudents();
            }
}
