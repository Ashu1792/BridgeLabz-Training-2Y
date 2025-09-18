package Level1;

public class CarRentalDemo {
    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double dailyRate = 1200.0;

        // Constructor
        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        double calculateTotalCost() {
            return rentalDays * dailyRate;
        }

        void display() {
            System.out.println("Rental: " + customerName + " rented " + carModel + " for " + rentalDays + " days.");
            System.out.println("Total Cost: ₹" + calculateTotalCost());
        }
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("SHIVAM", "Hyundai Creta", 5);
        rental.display();
    }
}