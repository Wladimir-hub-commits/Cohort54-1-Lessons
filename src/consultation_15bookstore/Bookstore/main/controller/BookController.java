package consultation_15bookstore.Bookstore.main.controller;

import consultation_15bookstore.Bookstore.main.model.Book;
import consultation_15bookstore.Bookstore.main.repository.BookRepository;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 * {code data} 09.01.2025
 */


public class BookController {
private BookRepository bookRepository;

public BookController() {
    bookRepository = new BookRepository();
}

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add book");
            System.out.println("2. Get info the book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. Print all books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Add book");
                    addBook(scanner);
                    // Add book
                    break;
                case 2:
                    System.out.println("Get info the book");
                    // Get info the book
                    break;
                case 3:
                    System.out.println("Update book");
                    // Update book
                    break;
                case 4:
                    System.out.println("Delete book");
                    // Delete book
                    break;
                case 5:
                    System.out.println("Print all books");
                    // Print all books
                    break;
                case 6:
                    System.out.println("Exit");
                    // Exit
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add book
    
    private  void  addBook(Scanner scanner) {
        System.out.println(" Enter book title: ");
        String title = scanner.nextLine();
        System.out.println(" Enter book author: ");
        String author = scanner.nextLine();
        System.out.println(" Enter book price: ");
        double price = scanner.nextDouble();
        System.out.println(" Enter book year: ");
        int year = scanner.nextInt();

        // Add book from data
        Book book = new Book(title, author, (int) price, year);
        bookRepository.addBook(book);
    }
}