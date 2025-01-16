package consultation_15bookstore.Bookstore.main.repository;

import consultation_15bookstore.Bookstore.main.model.Book;

import java.util.ArrayList;

/**
 * Author Waldemar Ilz
 * {code data} 09.01.2025
 */

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void getAllBooks() {
    }
}

