package Level1;

public class ItemInventoryDemo {

    // Item class definition
    static class Item {
        int itemCode;
        String itemName;
        double price;

        // Constructor to initialize item attributes
        Item(int itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        // Method to display item details and total cost
        void displayDetails(int quantity) {
            System.out.println("Item Details:");
            System.out.println("Code     : " + itemCode);
            System.out.println("Name     : " + itemName);
            System.out.println("Unit Price: ₹" + price);
            System.out.println("Quantity : " + quantity);
            System.out.println("Total Cost: ₹" + (price * quantity));
        }
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Create an Item object
        Item item1 = new Item(101, "Wireless Mouse", 799.00);

        // Display item details for a given quantity
        item1.displayDetails(3);
    }
}