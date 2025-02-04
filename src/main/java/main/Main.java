package main;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George Orwell", "British");
        Author author2 = new Author("Harper Lee", "American");

        Book book1 = new Book("1984", author1, 1949);
        Book book2 = new Book("To Kill a Mockingbird", author2, 1960);

        Bookshelf shelf = new Bookshelf();
        shelf.addBook(book1);
        shelf.addBook(book2);

        System.out.println("Books on the shelf:");
        shelf.displayBooks();
    }
}
