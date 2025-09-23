public class shopping {
    // Static variable shared by all products
    private static double discount = 10.0; // in percentage

    // Final variable for immutable product ID
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to resolve ambiguity
    public shopping(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to display product details with instanceof check
    public void displayDetails() {
        if (this instanceof shopping) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Name: " + this.productName);
            System.out.println("Price: ₹" + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Current Discount: " + discount + "%");
        } else {
            System.out.println("Invalid object. Not a Product instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        shopping p1 = new shopping("P101", "Wireless Mouse", 799.0, 2);
        shopping p2 = new shopping("P102", "Mechanical Keyboard", 2499.0, 1);

        p1.displayDetails();
        p2.displayDetails();

        shopping.updateDiscount(15.0); // Update discount globally

        p1.displayDetails(); // Reflect updated discount
    }
}