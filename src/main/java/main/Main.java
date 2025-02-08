package main;

public class Main {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();

        Book book1 = new Book("1984", "George Orwell", "978-0451524935");
        Book book2 = new Book("Animal Farm", "George Orwell", "978-0451526342");

        shelf.addBook(book1);
        shelf.addBook(book2);

        System.out.println("Initial bookshelf contents:");
        shelf.displayBooks();
        System.out.println();

        System.out.println("Removing 1984...");
        shelf.removeBook("1984");
        System.out.println();

        System.out.println("Updated bookshelf contents:");
        shelf.displayBooks();
    }
}
