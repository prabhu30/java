package Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPISorted {

    public static void main(String[] args) {

        List<Integer> obj = Arrays.asList(6, 5, 2, 7, 4);

        Stream<Integer> sortedValues = obj.stream() // Result is 6, 5, 2, 7, 4
                .filter(n -> n % 2 == 0) // Result is 6, 2, 4
                .map(n -> n * 2) // 12, 4, 8
                .sorted(); // 4, 8, 12

        sortedValues.forEach(n -> System.out.println(n));
    }
}
