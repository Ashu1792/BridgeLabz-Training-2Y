// No ArrayList used

// Book class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

// Library class (Aggregation using array)
class Library {
    private String name;
    private Book[] books;
    private int count;

    public Library(String name, int capacity) {
        this.name = name;
        this.books = new Book[capacity];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}

// Demonstration
public class AggregationDemo {
    public static void main(String[] args) {
        // Books can exist independently
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Libraries with capacity 5
        Library lib1 = new Library("City Library", 5);
        Library lib2 = new Library("School Library", 5);

        // Aggregation: Libraries aggregate books
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // Same book can be in multiple libraries
        lib2.addBook(b3);

        lib1.showBooks();
        lib2.showBooks();
    }
}