package Case_Study1.com.foodordering.model;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public class FineDineRestaurant extends Restaurant{

    public FineDineRestaurant(long restaurantId, String name, CuisineType cuisineType, String location, LocalTime openingTime, LocalTime closingTime, List<MenuItem> menuItems, boolean isActive) {
        super(restaurantId, name, cuisineType.FINE_DINING_RESTAURANT, location, openingTime, closingTime, menuItems, isActive);
    }
}
