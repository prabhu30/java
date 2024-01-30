package Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIOne {

    public static void main(String[] args) {

        List<Integer> obj = Arrays.asList(2, 5, 4, 7, 6);

        /*
         * IMPORTANT : A stream cannot be used or operated twice
         */

        Stream<Integer> s1 = obj.stream();

        Stream<Integer> s2 = s1.filter(num -> num % 2 == 0);
        // Result of above line is 2, 4, 6

        Stream<Integer> s3 = s2.map(num -> num * 2);
        // Result of above line is 4, 6, 12

        int finalResult = s3.reduce(0, (c, e) -> c + e);
        // Result of above line is 24

        System.out.println(finalResult);
    }
}
