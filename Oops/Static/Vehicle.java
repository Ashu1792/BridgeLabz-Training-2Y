public class Vehicle {
    // Static variable shared across all vehicles
    private static double registrationFee = 5000.0;

    // Final variable for unique registration number
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to resolve ambiguity
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: ₹" + registrationFee);
    }

    // Method to display vehicle details with instanceof check
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid object. Not a Vehicle instance.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP32AB1234", "Shivam", "Car");
        Vehicle v2 = new Vehicle("DL45XY5678", "Ravi", "Bike");

        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(5500.0);
        v1.displayDetails();
    }
}