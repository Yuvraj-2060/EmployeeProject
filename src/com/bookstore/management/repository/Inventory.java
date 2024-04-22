package com.bookstore.management.repository;

import com.bookstore.management.model.Book;
import java.util.List;

public interface Inventory {
    //List<Book> books = new ArrayList<>();

    void addBook(Book book);

    void removeBook(Book book);

    void displayInventory();

    Book findBookByTitle(String title);

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByPriceRange(double minPrice, double maxPrice);
}
