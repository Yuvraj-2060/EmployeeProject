package Case_Study1.com.foodordering.service;

import Case_Study1.com.foodordering.model.CuisineType;
import Case_Study1.com.foodordering.model.MenuItem;
import Case_Study1.com.foodordering.model.Restaurant;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService{
    @Override
    public void activateRestaurant(long restaurantId) {

    }

    @Override
    public void deActivateRestaurant(long restaurantId) {

    }

    @Override
    public void updateMenuItem(MenuItem item) {

    }

    @Override
    public Restaurant getRestaurantById(long id) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        return null;
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        return null;
    }

    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        return null;
    }

    @Override
    public List<Restaurant> findAllDeactivatedRestaurant() {
        return null;
    }
}
