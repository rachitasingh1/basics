package Composition;

import java.util.ArrayList;
import java.util.List;

public class LibraryBookComposition {

    public static void main(String... m) {
        Book book1 = new Book("Mysteries of Udolpho", "mysticalRealm", "Uma", 320);
        Book book2 = new Book("CrimeAndPunishment", "Mystery", "Dostoevsky", 670);
        Book book3 = new Book("Catch22", "Satire", "HGH", 560);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library britishCouncil = new Library(books);
        List<Book> getallBooks = britishCouncil.getBooksInLibrary();

        for (Book book : getallBooks) {
            System.out.println("Title: " + book.name + " Genre: " + book.genre + " author: " + book.author + " pages: "
                    + book.numberOfPages);
        }
    }
}
