public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "Kathy Sierra", 752);
        Book book2 = new Book("Java: A Beginner's Guide", "Herbert Schildt", 672);
        Book book3 = new Book("Clean Code", "Robert Cecil Martin", 464);

        System.out.println("\nBook 1 Info:");
        book1.displayInfo();
        System.out.println("\nBook 2 Info:");
        book2.displayInfo();
        System.out.println("\nBook 3 Info:");
        book3.displayInfo();

        System.out.println("\nAttempting to borrow books:");
        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();

        System.out.println("\nReturning books:");
        book1.returnBook();
        book2.returnBook();
    }
}
