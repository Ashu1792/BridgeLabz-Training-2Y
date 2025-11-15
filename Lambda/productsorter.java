import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " ₹" + price + " ★" + rating + " -" + discount + "%";
    }
}

public class productsorter {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 2500, 4.5, 10),
            new Product("Watch", 5000, 4.8, 20),
            new Product("Bag", 1500, 4.2, 15)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}