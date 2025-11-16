import java.util.Scanner;

public class Book {
    private static String libraryName = "Default Library";
    
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter library name: ");
            String libName = sc.nextLine();
            setLibraryName(libName);
            displayLibraryName();

            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            System.out.print("Enter author name: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();

            Book book = new Book(title, author, isbn);
            book.displayDetails();
        }
    }
    
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }
}
