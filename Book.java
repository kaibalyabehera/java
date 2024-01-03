import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

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

 class Main {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> books = new ArrayList<>();

        // Add book objects to the ArrayList
        books.add(new Book(1, "Gita Rahasya", "Bal Gangadhar Tilak"));
        books.add(new Book(2, "Gitanjali", "Rabindranath tagore"));
        books.add(new Book(3, "Ghasiram Kotwal", "Vijay Tendulkar"));

        // Display all book details using an enhanced for loop
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println();
        }
    }
}







