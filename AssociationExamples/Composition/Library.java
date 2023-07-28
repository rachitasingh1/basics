package Composition;

import java.util.*;

class Library {

    private final List<Book> books;

    Library(List<Book> books) {

        this.books = books;
    }

    public List<Book> getBooksInLibrary() {

        return books;
    }

}