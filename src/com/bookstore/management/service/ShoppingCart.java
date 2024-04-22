package com.bookstore.management.service;

import com.bookstore.management.model.Book;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> items = new ArrayList<>();

    // Methods related to shopping cart

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Book book : items) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Book book) {
        items.add(book);
    }

    void removeItem(Book book) {
        items.remove(book);
    }

    void displayItems() {
        for (Book book : items) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
        }
    }
}
