package Concepts;

import java.util.Arrays;
import java.util.List;

public class StreamAPITwo {

    public static void main(String[] args) {

        List<Integer> obj = Arrays.asList(1, 5, 4, 7, 6);

        int result = obj.stream() // Result is 1, 5, 4, 7, 6
                .filter(n -> n % 2 == 0) // Result is 4, 6
                .map(n -> n * 2) // Result is 8, 12
                .reduce(0, (c, e) -> c + e); // Result is 20

        System.out.println(result);
    }

}
