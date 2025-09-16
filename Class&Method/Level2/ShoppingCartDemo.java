package Level2;

public class ShoppingCartDemo {

    // CartItem class definition
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        // Constructor to initialize item details
        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to add items to the cart
        void addItem(int qty) {
            if (qty > 0) {
                quantity += qty;
                System.out.println(qty + " " + itemName + "(s) added to cart.");
            } else {
                System.out.println("Invalid quantity to add.");
            }
        }

        // Method to remove items from the cart
        void removeItem(int qty) {
            if (qty > 0 && qty <= quantity) {
                quantity -= qty;
                System.out.println(qty + " " + itemName + "(s) removed from cart.");
            } else if (qty > quantity) {
                System.out.println("Cannot remove more than available quantity.");
            } else {
                System.out.println("Invalid quantity to remove.");
            }
        }

        // Method to display total cost
        void displayTotalCost() {
            double total = price * quantity;
            System.out.println("Cart Summary:");
            System.out.println("Item     : " + itemName);
            System.out.println("Unit Price: ₹" + price);
            System.out.println("Quantity : " + quantity);
            System.out.println("Total Cost: ₹" + total);
        }
    }

    // Main method to test the CartItem class
    public static void main(String[] args) {
        // Create a CartItem object
        CartItem cart = new CartItem("Bluetooth Speaker", 2499.00, 1);

        // Simulate cart operations
        cart.displayTotalCost();
        cart.addItem(2);
        cart.displayTotalCost();
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}