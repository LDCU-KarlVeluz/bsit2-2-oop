class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (isAvailable) {
            System.out.println("Available: Yes");
        } else {
            System.out.println("Available: No");
        }
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned '" + title + "'.");
    }
}
