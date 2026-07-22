package com.librarymanagment.Respository;

public class BookRepository {

    public BookRepository() {
    System.out.println("BookRepository Bean Created");
    }
 public void saveBook() {
        System.out.println("Book saved successfully.");
    }
    public void display() {
        System.out.println("BookRepository display method called");
    }

}
