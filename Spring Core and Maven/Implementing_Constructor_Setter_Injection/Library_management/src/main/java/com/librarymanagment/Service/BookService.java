package com.librarymanagment.Service;


import com.librarymanagment.Respository.BookRepository;
public class BookService {

    private BookRepository ConstructorRepository;
    private BookRepository SetterRepository;

    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
        System.out.println("Constructor Injection Successful");
    }

    //Setter Injection
     public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
        System.out.println("Setter Injection Successful");
    }

 public void addBook() {
        System.out.println("BookService: Adding a new book...");
        
    
     System.out.println("Using Constructor Repository: " );
     constructorRepository.saveBook();
        
     System.out.println("Using Setter Repository: ");
     setterRepository.saveBook();
    }
}
