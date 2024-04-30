package Case_Study1.com.foodordering.model;

import java.util.HashSet;
import java.util.Set;

public class FastFoodRestaurant extends Restaurant {

    private Set<String> menuItems;

    public FastFoodRestaurant(String name, String location, String open_Time, String close_Time, String cuisine_Type, boolean status,Set<String> menuItems) {
        super(name, location, open_Time, close_Time, cuisine_Type, status);
        this.menuItems = menuItems;
    }

    public Set<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Set<String> menuItems) {
        this.menuItems = menuItems;
    }
    public void displayMenu(){
        System.out.println("Menu Items: "+getClass().getSimpleName());
        menuItems.forEach(System.out::println);
    }
    public void addMenuItem(String newItem, Set<String> menuItems){
        menuItems.add(newItem);
    }
}
