package com.company;

import java.util.ArrayList;

public class BookDatabase {
    private Book book;
    private ArrayList<Book> books;

    public BookDatabase(){
        book = new Book();
        books = new ArrayList<>();

        books.add(new Book("Dave W.",310,"Book 314","Java programming book",59.99));
        books.add(new Book("Dave W.",400,"Book 8910", "Python programming book",49.99));
    }

    public void printAllBooks(ArrayList<Book> books){
        for(Book book : books) {
            System.out.println(book.toStringBook());
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}


