import java.util.*;

class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private final EComCustomer customer;
    private final List<Product> products;
    private final int orderId;
    private static int nextId = 1;

    public Order(EComCustomer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderId = nextId++;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public EComCustomer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void showOrderDetails() {
        System.out.println("Order #" + orderId + " by " + customer.getName() + ":");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " ($" + p.getPrice() + ")");
        }
    }
}

class EComCustomer {
    private final String name;
    private final List<Order> orders;

    public EComCustomer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void showOrders() {
        System.out.println(name + " has placed the following orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        // Products
        Product laptop = new Product("Laptop", 1200.0);
        Product phone = new Product("Phone", 800.0);
        Product headphones = new Product("Headphones", 150.0);
        Product mouse = new Product("Mouse", 40.0);

        // Customers
    EComCustomer alice = new EComCustomer("Alice");
    EComCustomer bob = new EComCustomer("Bob");

    // Orders
    Order order1 = new Order(alice);
    order1.addProduct(laptop);
    order1.addProduct(mouse);
    alice.placeOrder(order1);

    Order order2 = new Order(bob);
    order2.addProduct(phone);
    order2.addProduct(headphones);
    bob.placeOrder(order2);

    Order order3 = new Order(alice);
    order3.addProduct(headphones);
    alice.placeOrder(order3);

    // Show orders for each customer
    alice.showOrders();
    System.out.println();
    bob.showOrders();
    }
}
