package main.java;

import main.java.shopping.cart.ShoppingCart;
import main.java.products.*;

public class TestMain {
    public static void main(String[] args) {
        // Creating instances of products
        Electronics laptop = new Electronics("Laptop", 1, 1200.0, 5, "Asus", 1);
        Clothing shirt = new Clothing("T-Shirt", 3, 25.0, 10, "M", "Cotton");

        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct(laptop);
        cart.addProduct(shirt);

        // Displaying cart contents and total price
        cart.displayCart();
        System.out.println("Total Price: RS: " + cart.calculateTotalPrice());
    }
}