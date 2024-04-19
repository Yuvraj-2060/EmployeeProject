package main.java;

import main.java.exception.DuplicateProductIdException;
import main.java.exception.ProductNotFoundException;
import main.java.shopping.cart.ShoppingCart;
import main.java.products.*;

public class TestMain {
    public static void main(String[] args) throws DuplicateProductIdException, ProductNotFoundException {
        // Creating instances of products
        Electronics laptop = new Electronics("Laptop", 101, 1200.0, 5, "Asus", 1);
        Clothing shirt = new Clothing("T-Shirt", 101, 25.0, 10, "M", "Cotton");

        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
       try {
            cart.addProduct(laptop);
            cart.addProduct(shirt);
        }
       catch (DuplicateProductIdException e){
           System.out.println(e);
       }

        // Deleting product with any particular product ID

        try{
            cart.deleteProduct(shirt.getProductId());
        }
        catch (ProductNotFoundException e){
            System.out.println(e);
        }

        // Displaying cart contents and total price
        cart.displayCart();
        System.out.println("Total Price: RS: " + cart.calculateTotalPrice());
    }
}