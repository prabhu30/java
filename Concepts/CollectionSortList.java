package Concepts;

import java.util.*;

public class CollectionSortList {

    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();

        obj.add(82);
        obj.add(34);
        obj.add(86);
        obj.add(81);

        Comparator<Integer> comparator = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {

                if (i > j)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(obj, comparator);

        System.out.println(obj);
    }
}
