package Case_Study1.com.foodordering;

import Case_Study1.com.foodordering.model.FastFoodRestaurant;
import Case_Study1.com.foodordering.model.FineDineRestaurant;

import java.util.HashSet;
import java.util.Set;

public class OnlineFoodOrderingSystem {
    public static void main(String[] args) {
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant("KGN Express","Pune","9:00am","6:00pm","Chinese",true,new HashSet<>(Set.of("Noodles","Manchow","Fries","Soup")));
        fastFoodRestaurant.displayMenu();

        FineDineRestaurant fineDineRestaurant = new FineDineRestaurant("Global Punjab","Delhi","11:00am","9:00pm","North",false,new HashSet<>(Set.of("Paneer Masala","Tandoor","Butter Naan","Mix Veg")));
        fineDineRestaurant.displayMenu();

        fastFoodRestaurant.addMenuItem("Fried Rice",fastFoodRestaurant.getMenuItems());
        System.out.println("\n******** Updated MenuItems Of ");
        fastFoodRestaurant.displayMenu();



    }
}
