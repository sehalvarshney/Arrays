class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Thinking in Java", "Bruce Eckel");
        books[1] = new Book("Effective Java", "Joshua Bloch");
        books[2] = new Book("Clean Code", "Robert C. Martin");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title);
        }
    }
}
