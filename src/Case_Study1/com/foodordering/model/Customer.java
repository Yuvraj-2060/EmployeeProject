package Case_Study1.com.foodordering.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<CartItem> cartItemList;
    private String customerName;
    private long customerId;

    public Customer(String customerName, long customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        cartItemList = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

}
