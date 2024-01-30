package Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortListTwo {

    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();

        obj.add(12);
        obj.add(45);
        obj.add(34);
        obj.add(23);

        Comparator<Integer> comparator = (Integer i, Integer j) -> (i > j) ? 1 : -1;

        Collections.sort(obj, comparator);

        System.out.println(obj);
    }
}
