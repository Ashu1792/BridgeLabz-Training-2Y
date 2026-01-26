package ObjectModelling.prolem3;

import java.util.ArrayList;
import java.util.List;

public class hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " joined " + name);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " admitted to " + name);
    }

    public void showHospitalRoster() {
        System.out.println("\nHospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}