package Case_Study1.com.foodordering.respository;

import Case_Study1.com.foodordering.model.CartItem;

public interface CustomerRepository {
    public void addCartItems(CartItem cartItem);
    public void removeCartItems(CartItem cartItem);
    public void totalCartValue();
}
