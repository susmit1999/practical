
class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;

    public Book(int id, String name, String author) {
        this.bookId = id;
        this.bookName = name;
        this.bookAuthor = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int id) {
        this.bookId = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(int id, String name, String author) {
        Book book = new Book(id, name, author);
        books.add(book);
    }

    public void dispanseBook(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                books.remove(book);
                System.out.println("Book with ID " + id + " has been dispensed.");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found in library.");
    }

    public void displayBooks() {
        System.out.println("List of Books in Library:");
        for (Book book : books) {
            System.out.println(book.getBookId() + " | " +
                               book.getBookName() + " | " +
                               book.getBookAuthor());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books to the library
        library.addBook(1, "The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(2, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(3, "1984", "George Orwell");

        // Display the books in the library
        library.displayBooks();

        // Dispense a book from the library
        library.dispanseBook(2);

        // Display the books in the library again
        library.displayBooks();
    }
}
