package Z_Java_8_Features.Lambda_Expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithCollection {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Yuvraj", "Abhay", "Virat", "David"));

        //1. Advance For Loop
        for (String str : names)
            System.out.println(str);
        //2. Using forEach
        names.forEach(
                (n)-> System.out.println(n)
        );
    }
}
