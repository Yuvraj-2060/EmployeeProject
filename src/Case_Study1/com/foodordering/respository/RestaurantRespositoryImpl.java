package Case_Study1.com.foodordering.respository;


import Case_Study1.com.foodordering.model.CartItem;
import Case_Study1.com.foodordering.model.CuisineType;
import Case_Study1.com.foodordering.model.MenuItem;
import Case_Study1.com.foodordering.model.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRespositoryImpl implements RestaurantRepository {

    Map<Long,Restaurant> restaurantMap = new HashMap<>();
    List<CartItem>  cartItemList = new ArrayList<CartItem>();
    @Override
    public void addRestaurant(Restaurant restaurant) {
        restaurantMap.put(restaurant.getRestaurantId(),restaurant);
    }

    @Override
    public void setActivationStatus(Restaurant restaurant, boolean status) {
        restaurant.setActive(status);
    }

    @Override
    public void updateMenuItem(MenuItem item, Restaurant restaurant) {
        List<MenuItem> menuList = restaurant.getMenuItems();
        menuList.add(item);
        restaurant.setMenuItems(menuList);
    }

    @Override
    public Restaurant getRestaurantById(long id) {
        return restaurantMap.get(id);
    }

    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        List<Restaurant> foundRestaurant = new ArrayList<>();
        foundRestaurant=restaurantMap.values().stream().filter(restaurant -> restaurant.getLocation().equalsIgnoreCase(location)).toList();
        return foundRestaurant;
    }

    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        List<Restaurant> foundRestaurant;
        foundRestaurant=restaurantMap.values().stream().filter(restaurant -> restaurant.getName().equalsIgnoreCase(name)).toList();
        return foundRestaurant;
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        List<Restaurant> foundRestaurant;
        foundRestaurant=restaurantMap.values().stream().filter(restaurant -> restaurant.getCuisineType().equals(type)).toList();
        return foundRestaurant;
    }

    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        List<Restaurant> foundRestaurant;
        foundRestaurant=restaurantMap.values().stream().filter(restaurant -> restaurant.isActive()==true).toList();
        return foundRestaurant;
    }

    @Override
    public List<Restaurant> findAllDeactivatedRestaurant() {
        List<Restaurant> foundRestaurant;
        foundRestaurant=restaurantMap.values().stream().filter(restaurant -> restaurant.isActive()==false).toList();
        return foundRestaurant;
    }

    @Override
    public void activateRestaurant(long restaurantId) {
        Restaurant restaurant = restaurantMap.get(restaurantId);
        restaurant.setActive(true);
    }

    @Override
    public void deactivateRestaurant(long restaurantId) {
        Restaurant restaurant = restaurantMap.get(restaurantId);
        restaurant.setActive(false);
    }

}
