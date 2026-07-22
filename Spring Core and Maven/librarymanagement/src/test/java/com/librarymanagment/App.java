package com.librarymanagment;

import com.librarymanagment.Service.BookService;
import com.librarymanagment.Respository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        BookService service = new BookService(repo);
        service.display();
    }
}