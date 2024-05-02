package Case_Study1.com.foodordering.service;

import Case_Study1.com.foodordering.model.CuisineType;
import Case_Study1.com.foodordering.model.MenuItem;
import Case_Study1.com.foodordering.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    public void activateRestaurant(long restaurantId);

    public void deActivateRestaurant(long restaurantId);

    public void updateMenuItem(MenuItem item,Restaurant restaurant);

    public Restaurant getRestaurantById(long id);

    public List<Restaurant> findRestaurantByLocation(String location);

    public List<Restaurant> findRestaurantByName(String name);

    public List<Restaurant> findRestaurantByType(CuisineType type);

    public List<Restaurant> findAllActiveRestaurant();

    public List<Restaurant> findAllDeactivatedRestaurant();
}
