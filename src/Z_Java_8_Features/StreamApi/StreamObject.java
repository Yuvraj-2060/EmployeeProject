package Z_Java_8_Features.StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //1). Blank
        Stream<Object> emptyObject = Stream.empty();

        //2). array, object, collection
        String names[] = {"Yuvraj", "Virat", "David", "Mike"};
        System.out.println(Arrays.stream(names).collect(Collectors.toList()));
        System.out.println(Arrays.stream(names).toList());

        System.out.println();
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e-> System.out.println(e));

        //3).
        Stream<Object> streamBuilder = Stream.builder().build();

        //4).
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        stream.forEach(e-> System.out.println(e));

        //5). List, Set

    }

}
