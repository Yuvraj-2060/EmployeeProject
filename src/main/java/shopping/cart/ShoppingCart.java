package main.java.shopping.cart;

import java.util.ArrayList;
import main.java.products.Product;

public class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : cartItems) {
            product.displayDetails();
            System.out.println("-------------------");
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : cartItems) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
