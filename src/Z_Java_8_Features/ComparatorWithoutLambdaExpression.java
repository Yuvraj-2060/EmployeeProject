package Z_Java_8_Features;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products implements Comparable<Products> {
    int id;
    String name;
    float price;

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public int compareTo(Products other){
        return Float.compare(this.price,other.price);
    }
}
public class ComparatorWithoutLambdaExpression {
    public static void main(String[] args) {
        List<Products> list = new ArrayList<Products>();
        list.add(new Products(1, "Samsung", 170000f));
        list.add(new Products(3, "Iphone 6S", 65000f));
        list.add(new Products(2, "Sony Xperia", 25000f));
        list.add(new Products(4, "Nokia Lumia", 15000f));
        list.add(new Products(5, "Redmi4 ", 26000f));
        list.add(new Products(6, "Lenevo Vibe", 19000f));

        Collections.sort(list);

        for(Products product: list){
            System.out.println(product.name+": "+product.price);
        }
    }
}
