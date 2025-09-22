public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("Adding books to Library...");
        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\nAll books in Library:");
        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nTrying to borrow Java Programming again...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();

        System.out.println("\nReturning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Failed to return the book.");
        }

        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("Invalid Book", "Invalid Author", "123", 1400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Book invalidIsbnBook = new Book("Invalid ISBN Book", "Author", "12345", 2022);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
