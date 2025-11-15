package problem4;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product: " + product.name);
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.orderId);
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mouse", 1500);

        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Customer customer = new Customer("SHIVAM");
        customer.placeOrder(order1);

        System.out.println("Total bill: ₹" + order1.calculateTotal());
    }
}