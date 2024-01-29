package Concepts;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {

    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<Integer>();
        obj.add(5);
        obj.add(3);
        obj.add(8);

        System.out.println(obj);

        // length of array list
        System.out.print("Length of Array list - ");
        System.out.println(obj.size());

        // Get element at index i
        System.out.print("2nd element of Array list - ");
        System.out.println(obj.get(1));

        // Get index of element e
        System.out.print("Index of element 8 - ");
        System.out.println(obj.indexOf(8));

        // Add another array list into current list
        ArrayList<Integer> obj2 = new ArrayList<Integer>();
        obj2.add(10);
        obj2.add(0);
        obj2.add(14);

        obj.addAll(obj2);

        System.out.print("Updated List is - ");
        System.out.println(obj);

        // Updated Length
        System.out.print("Updated Length of Array list - ");
        System.out.println(obj.size());
    }

}
