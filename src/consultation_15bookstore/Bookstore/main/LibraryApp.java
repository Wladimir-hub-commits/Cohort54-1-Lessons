package consultation_15bookstore.Bookstore.main;


/**
 * Author Waldemar Ilz
 * {code data} 09.01.2025
 */


import consultation_15bookstore.Bookstore.main.controller.BookController;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();

    }

}

