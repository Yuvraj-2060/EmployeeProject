package Case_Study1.com.foodordering.model;

import java.util.List;

public class Order {
    List<CartItem> orderItems;
    String userAddress;
    String paymentType;

    public Order(List<CartItem> orderItems, String userAddress, String paymentType) {
        this.orderItems = orderItems;
        this.userAddress = userAddress;
        this.paymentType = paymentType;
    }

    public List<CartItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<CartItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
