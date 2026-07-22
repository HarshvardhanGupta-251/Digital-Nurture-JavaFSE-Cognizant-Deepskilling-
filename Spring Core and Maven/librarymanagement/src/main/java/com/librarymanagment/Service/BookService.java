package com.librarymanagment.Service;


import com.librarymanagment.Respository.BookRepository;
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService Bean Created");
    }

    public void display() {
        System.out.println("BookService display method called");
        bookRepository.display();
    }
}
