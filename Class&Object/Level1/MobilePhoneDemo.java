package Level1;

public class MobilePhoneDemo {

    // MobilePhone class definition
    static class MobilePhone {
        String brand;
        String model;
        double price;

        // Constructor to initialize phone attributes
        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        // Method to display phone details
        void displayDetails() {
            System.out.println("Mobile Phone Details:");
            System.out.println("Brand : " + brand);
            System.out.println("Model : " + model);
            System.out.println("Price : ₹" + price);
        }
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Create a MobilePhone object
        MobilePhone phone1 = new MobilePhone("OnePlus", "Nord CE 3 Lite", 19999.00);

        // Display the phone's details
        phone1.displayDetails();
    }
}