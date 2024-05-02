package Case_Study1.com.foodordering.UI;

import Case_Study1.com.foodordering.model.*;
import Case_Study1.com.foodordering.respository.RestaurantRepository;
import Case_Study1.com.foodordering.respository.RestaurantRespositoryImpl;
import Case_Study1.com.foodordering.service.RestaurantService;
import Case_Study1.com.foodordering.service.RestaurantServiceImpl;

import java.time.LocalTime;
import java.util.*;

import static Case_Study1.com.foodordering.model.CuisineType.FAST_FOOD_RESTAURANT;
import static Case_Study1.com.foodordering.model.CuisineType.FINE_DINING_RESTAURANT;

public class OnlineFoodOrderingSystem {
    public static void main(String[] args) {
        RestaurantRepository restaurantRepository = new RestaurantRespositoryImpl();
        //RestaurantService restaurantService = new RestaurantServiceImpl();

        Restaurant restaurant1 = new Restaurant(101,"KGN Express",FAST_FOOD_RESTAURANT,"Pune", LocalTime.parse("11:00"),LocalTime.parse("09:00"),new ArrayList<>(),true);
        Restaurant restaurant2 = new Restaurant(102,"Global Punjab",FINE_DINING_RESTAURANT,"Pune", LocalTime.parse("12:00"),LocalTime.parse("07:00"),new ArrayList<>(),false);
        Restaurant restaurant3 = new FastFoodRestaurant(103, "BiggBoss", FAST_FOOD_RESTAURANT,"Kolkata",LocalTime.parse("09:00"), LocalTime.parse("19:00"), new ArrayList<>(), true);

        restaurantRepository.addRestaurant(restaurant1);
        restaurantRepository.addRestaurant(restaurant2);
        restaurantRepository.addRestaurant(restaurant3);

        MenuItem menuItem1 = new MenuItem("Noodles",150, ItemType.VEG,150);
        restaurantRepository.updateMenuItem(menuItem1,restaurant1);

        MenuItem menuItem2 = new MenuItem("Chicken Tikka",150, ItemType.NON_VEG,320);
        restaurantRepository.updateMenuItem(menuItem2,restaurant2);

        MenuItem menuItem3 = new MenuItem("Paneer Tikka",150, ItemType.VEG,300);
        restaurantRepository.updateMenuItem(menuItem3,restaurant3);

        long restaurantIdToActivate = 101;
        restaurantRepository.activateRestaurant(restaurantIdToActivate);
        List<Restaurant> activeRestaurant = restaurantRepository.findAllActiveRestaurant();
        System.out.println(activeRestaurant.toString());
    }
}
