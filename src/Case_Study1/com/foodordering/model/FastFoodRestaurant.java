package Case_Study1.com.foodordering.model;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FastFoodRestaurant extends Restaurant {


    public FastFoodRestaurant(long restaurantId, String name, CuisineType cuisineType, String location, LocalTime openingTime, LocalTime closingTime, List<MenuItem> menuItems, boolean isActive) {
        super(restaurantId, name, cuisineType.FAST_FOOD_RESTAURANT, location, openingTime, closingTime, menuItems, isActive);
    }
}
