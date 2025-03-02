package management;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

  
    public Library() {
        books = new ArrayList<>();
    }

  
    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                books.remove(book);
                return true;
            }
        }
        return false; 
    }


    public Book searchBookByID(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
