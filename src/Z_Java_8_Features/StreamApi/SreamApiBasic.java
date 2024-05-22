package Z_Java_8_Features.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SreamApiBasic {
    public static void main(String[] args) {
//        List<String> names = List.of("Hasrshal Kumar", "Virat Kohli", "Mahendra Singh Dhoni", "Akash", "Karan Chopra");
//
//        // return all names separated by comma
//        List<String> validNames = getValidNames(List < String > names);
//
//        // Rahul Kumar Sahu
//        List<String> shortNames = getShortNames(List < String > names);
//
//        // HK, VK, MSD, KC
//        String allNames = getAllNames(List < String > names);

        // Q.1) Create List & Filter all even numbers from list

        List<Integer> list1 = List.of(2,4,50,21,22,67); // Creates Immutable List.
        System.out.println(list1.stream().filter(x->x%2==0).collect(Collectors.toList()));

        List<Integer> evenList = list1.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> list2 = new ArrayList<>(); // Creates Mutable List.
            list2.add(12);
            list2.add(34);
            list2.add(23);
            list2.add(78);

        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24); // Creates Immutable List.


    }
}