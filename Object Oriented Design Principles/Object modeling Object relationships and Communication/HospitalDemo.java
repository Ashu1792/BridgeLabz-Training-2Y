import java.util.*;

class Patient {
    private final String name;
    private final List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void showDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

class Doctor {
    private final String name;
    private final List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // maintain association both ways
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private final String name;
    private final List<Doctor> doctors;
    private final List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");
        Doctor drLee = new Doctor("Lee");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");
        Patient charlie = new Patient("Charlie");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addDoctor(drLee);

        hospital.addPatient(alice);
        hospital.addPatient(bob);
        hospital.addPatient(charlie);

        // Consultations
        drSmith.consult(alice);
        drSmith.consult(bob);
        drJones.consult(bob);
        drJones.consult(charlie);
        drLee.consult(alice);
        drLee.consult(charlie);

        System.out.println();
        drSmith.showPatients();
        drJones.showPatients();
        drLee.showPatients();
        System.out.println();
        alice.showDoctors();
        bob.showDoctors();
        charlie.showDoctors();
    }
}
