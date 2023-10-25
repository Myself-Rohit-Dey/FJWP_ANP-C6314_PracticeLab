package session_15;

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter Methods
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> books = new ArrayList<>();

        // Adding Book objects to the ArrayList
        books.add(new Book(1, "Anna Karenina", "Leo Tolstoy"));
        books.add(new Book(2, "The Fault in Our Stars", "John Green"));
        books.add(new Book(3, "Five Feet Apart", "Rachael Lippincott"));

        // Display all book details using enhanced for loop
        System.out.println("All Book Details:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println("-----------------------");
        }
    }
}

/*Output:

All Book Details:
Book ID: 1
Book Name: Anna Karenina
Author Name: Leo Tolstoy
-----------------------
Book ID: 2
Book Name: The Fault in Our Stars
Author Name: John Green
-----------------------
Book ID: 3
Book Name: Five Feet Apart
Author Name: Rachael Lippincott
-----------------------
 
*/

