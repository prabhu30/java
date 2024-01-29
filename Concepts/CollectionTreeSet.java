package Concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet is a sorted set
 */
public class CollectionTreeSet {

    public static void main(String[] args) {

        Set<Integer> obj = new TreeSet<Integer>();
        obj.add(4);
        obj.add(3);
        obj.add(5);
        obj.add(1);

        Iterator<Integer> values = obj.iterator();

        while (values.hasNext())
            System.out.println(values.next());
    }

}
