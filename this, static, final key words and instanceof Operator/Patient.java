public class Patient {
    public static void main(String[] args) {
        Patient p = Patient.inputPatient();
        p.displayDetails(p);
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
    
    public static Patient inputPatient() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Ailment: ");
        String ailment = sc.nextLine();
        return new Patient(name, age, ailment, id);
    }
    
    public static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private final String name;
    private final int age;
    private final String ailment;
    public final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Patient p) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        } else {
            System.out.println("Object is not a Patient instance.");
        }
    }
}
