package Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeNewer implements Comparable<EmployeeNewer> {

    String name;
    int salary;

    public EmployeeNewer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeNewer [name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(EmployeeNewer that) {
        return this.salary > that.salary ? 1 : -1;
    }

}

public class CollectionSortListFive {

    public static void main(String[] args) {

        List<EmployeeNewer> obj = new ArrayList<>();

        EmployeeNewer anuradha = new EmployeeNewer("anuradha", 90_000);
        EmployeeNewer prabhu = new EmployeeNewer("prabhu", 50_000);
        EmployeeNewer prakash = new EmployeeNewer("prakash", 80_000);

        obj.add(anuradha);
        obj.add(prakash);
        obj.add(prabhu);

        Comparator<EmployeeNewer> comparator = (EmployeeNewer e1, EmployeeNewer e2) -> (e1.salary > e2.salary) ? 1 : -1;

        Collections.sort(obj, comparator);

        for (EmployeeNewer e : obj) {
            System.out.println(e);
        }
    }

}