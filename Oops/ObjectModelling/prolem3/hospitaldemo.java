package ObjectModelling.prolem3;

public class hospitaldemo {
    public static void main(String[] args) {
        hospital hospital = new hospital("Sunrise Care Hospital");

        // Create doctors and patients
        Doctor d1 = new Doctor("Shivam");
        Doctor d2 = new Doctor("Riya");

        Patient p1 = new Patient();
        Patient p2 = new Patient();

        // Add to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Display relationships
        hospital.showHospitalRoster();
        d1.showConsultedPatients();
        d2.showConsultedPatients();
        p1.showConsultedDoctors();
        p2.showConsultedDoctors();
    }
}