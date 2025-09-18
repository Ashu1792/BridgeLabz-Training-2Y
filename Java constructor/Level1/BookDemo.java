package Level1;

public class BookDemo {
    static class Book {
        String title;
        String author;
        double price;

        // Default constructor
        Book() {
            title = "Unknown";
            author = "Unknown";
            price = 0.0;
        }

        // Parameterized constructor
        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("Book: " + title + " by " + author + " - ₹" + price);
        }
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Atomic Habits", "James Clear", 499.00);
        defaultBook.display();
        customBook.display();
    }
}