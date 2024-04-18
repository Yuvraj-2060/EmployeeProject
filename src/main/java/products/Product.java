package main.java.products;

public class Product {
    protected String productName;
    protected int productId;
    protected double price;
    protected int quantityInStock;

    public Product(String productName, int productId, double price, int quantityInStock) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayDetails() {
        System.out.println("Product: " + productName);
        System.out.println("ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
    public double getPrice() {
        return price;
    }
}
