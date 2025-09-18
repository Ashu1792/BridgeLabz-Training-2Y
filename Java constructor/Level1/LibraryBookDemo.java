package Level1;

public class LibraryBookDemo {
    static class Book {
        String title;
        String author;
        double price;
        boolean available;

        Book(String title, String author, double price, boolean available) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = available;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("You have borrowed: " + title);
            } else {
                System.out.println("Sorry, " + title + " is not available.");
            }
        }

        void display() {
            System.out.println("Book: " + title + " by " + author + " - ₹" + price + " | Available: " + available);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 699.00, true);
        book1.display();
        book1.borrowBook();
        book1.borrowBook(); // Try borrowing again
        book1.display();
    }
}