package com.librarymanagment.Service;


import com.librarymanagment.Respository.BookRepository;
public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookService() {
        System.out.println("BookService Bean Created");
    }
 public void addBook() {
        System.out.println("BookService: Adding a new book...");
        bookRepository.saveBook();
    }
    public void display() {
        System.out.println("BookService display method called");
        bookRepository.display();
    }
}
