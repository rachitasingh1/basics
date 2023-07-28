package Composition;

public class Book {

    String name;
    String genre;
    String author;
    int numberOfPages;

    public Book(String name, String genre, String author, int pages) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.numberOfPages = pages;
    }

    public void printBook() {
        System.out.println("Book name: " + name);
        System.out.println("Book genre: " + genre);
        System.out.println("Book author: " + author);
        System.out.println("Book pages: " + numberOfPages);
    }
}
