package com.bookstore.management;

import com.bookstore.management.model.Book;
import com.bookstore.management.repository.Inventory;
import com.bookstore.management.repository.InventoryImpl;
import com.bookstore.management.service.ShoppingCart;

public class Bookstore {
    public static void main(String[] args) {
        Book book1 = new Book("50 Shades Of Grey", "Author abc", 200.99);
        Book book2 = new Book("Dumb Island", "Author xyz", 150.99);
        Book book3 = new Book("DS & Algo", "Author zyk", 800.99);

        Inventory inventory = new InventoryImpl();
        ShoppingCart shoppingCart = new ShoppingCart();

        // Add books to inventory
        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);

        // Add books to shopping cart
        shoppingCart.addItem(book1);
        shoppingCart.addItem(book2);
        shoppingCart.addItem(book3);

        // Display inventory
        System.out.println("Inventory:");
        inventory.displayInventory();

        // Display total price of items in shopping cart
        System.out.println("\nTotal Price in Shopping Cart: Rs." + shoppingCart.calculateTotalPrice());
    }
}
