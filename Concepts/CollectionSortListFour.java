package Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeNew implements Comparable<EmployeeNew> {

    String name;
    int salary;

    public EmployeeNew(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeNew [name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(EmployeeNew that) {
        return this.salary > that.salary ? 1 : -1;
    }

}

public class CollectionSortListFour {

    public static void main(String[] args) {

        List<EmployeeNew> obj = new ArrayList<>();

        EmployeeNew anuradha = new EmployeeNew("anuradha", 90_000);
        EmployeeNew prabhu = new EmployeeNew("prabhu", 50_000);
        EmployeeNew prakash = new EmployeeNew("prakash", 80_000);

        obj.add(anuradha);
        obj.add(prakash);
        obj.add(prabhu);

        Collections.sort(obj);

        for (EmployeeNew e : obj) {
            System.out.println(e);
        }
    }

}
