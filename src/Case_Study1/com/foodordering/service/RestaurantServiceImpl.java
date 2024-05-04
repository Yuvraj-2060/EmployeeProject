package Case_Study1.com.foodordering.service;

import Case_Study1.com.foodordering.model.CuisineType;
import Case_Study1.com.foodordering.model.MenuItem;
import Case_Study1.com.foodordering.model.Restaurant;
import Case_Study1.com.foodordering.respository.RestaurantRepository;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService{
    RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl() {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void activateRestaurant(long restaurantId) {
        restaurantRepository.activateRestaurant(restaurantId);
    }

    @Override
    public void deActivateRestaurant(long restaurantId) {
        restaurantRepository.deactivateRestaurant(restaurantId);

    }

    @Override
    public void updateMenuItem(MenuItem item,Restaurant restaurant) {

        restaurantRepository.updateMenuItem(item,restaurant);
    }

    @Override
    public Restaurant getRestaurantById(long id) {
        return restaurantRepository.getRestaurantById(id);
    }

    @Override
    public List<Restaurant> findRestaurantByLocation(String location) {
        return restaurantRepository.findRestaurantByLocation(location);
    }

    @Override
    public List<Restaurant> findRestaurantByName(String name) {
        return restaurantRepository.findRestaurantByName(name);
    }

    @Override
    public List<Restaurant> findRestaurantByType(CuisineType type) {
        return restaurantRepository.findRestaurantByType(type);
    }

    @Override
    public List<Restaurant> findAllActiveRestaurant() {
        return restaurantRepository.findAllActiveRestaurant();
    }

    @Override
    public List<Restaurant> findAllDeactivatedRestaurant() {
       return restaurantRepository.findAllDeactivatedRestaurant();
    }

    @Override
    public void addCartItems() {

    }

    @Override
    public void totalCartValue() {

    }
}
