package Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

}

public class CollectionSortListThree {

    public static void main(String[] args) {

        List<Employee> obj = new ArrayList<>();

        Employee anuradha = new Employee("anuradha", 90_000);
        Employee prabhu = new Employee("prabhu", 50_000);
        Employee prakash = new Employee("prakash", 80_000);

        obj.add(anuradha);
        obj.add(prakash);
        obj.add(prabhu);

        Comparator<Employee> comparator = (Employee i, Employee j) -> (i.salary > j.salary) ? 1 : -1;

        Collections.sort(obj, comparator);

        for (Employee employee : obj) {
            System.out.println(employee);
        }
    }
}
