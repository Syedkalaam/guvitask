package management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
           
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book by ID");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                   
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    Book newBook = new Book(bookID, title, author);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    System.out.print("Enter Book ID to remove: ");
                    int removeBookID = scanner.nextInt();
                    if (library.removeBook(removeBookID)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book with ID " + removeBookID + " not found.");
                    }
                    break;

                case 3:
                  
                    System.out.print("Enter Book ID to search: ");
                    int searchBookID = scanner.nextInt();
                    Book searchedBook = library.searchBookByID(searchBookID);
                    if (searchedBook != null) {
                        System.out.println("Book found: " + searchedBook);
                    } else {
                        System.out.println("Book with ID " + searchBookID + " not found.");
                    }
                    break;

                case 4:
                    
                    library.displayBooks();
                    break;

                case 5:
                
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
