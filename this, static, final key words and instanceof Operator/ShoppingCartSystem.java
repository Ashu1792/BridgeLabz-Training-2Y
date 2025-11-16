import java.util.Scanner;

class Product {
    private static double discount = 0.0;

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public double getDiscountedPrice() {
        return price * quantity * (1 - discount / 100);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        Product.updateDiscount(discount);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            products[i] = new Product(id, name, price, qty);
        }

        for (Product p : products) {
            if (p instanceof Product) {
                System.out.println("\nProduct Details:");
                p.displayDetails();
                System.out.println("Total after discount: " + p.getDiscountedPrice());
            }
        }
        sc.close();
    }
}
