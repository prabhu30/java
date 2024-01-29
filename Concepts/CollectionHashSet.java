package Concepts;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class CollectionHashSet {

    public static void main(String[] args) {

        Set<String> obj = new HashSet<String>();
        obj.add(null);
        obj.add("prabhu");
        obj.add("kalyan");
        obj.add("prabhu");

        Iterator<String> values = obj.iterator();

        while (values.hasNext())
            System.out.println(values.next());
    }
}
