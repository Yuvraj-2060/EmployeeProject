package main.java.shopping.cart;

import java.util.ArrayList;

import main.java.exception.DuplicateProductIdException;
import main.java.exception.ProductNotFoundException;
import main.java.products.Product;

public class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) throws DuplicateProductIdException {
        for (Product item : cartItems) {
            if (item.getProductId() == product.getProductId()) {
                throw new DuplicateProductIdException("This particular product id is already present.");
            }
        }
        cartItems.add(product);
    }
    public void deleteProduct(int productId) throws ProductNotFoundException {
        boolean found = false;
        for (Product product : cartItems) {
            if (product.getProductId() == productId) {
                found = true;
                cartItems.remove(product);
                break;
            }
        }
        if (!found) {
            throw new ProductNotFoundException("This particular product is not available.");
        }
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
