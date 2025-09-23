public class Book {
    // Static variable shared across all books
    private static String libraryName = "City Central Library";

    // Final variable to ensure immutability
    private final String isbn;
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details with instanceof check
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Invalid object. Not a Book instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        Book.displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
}