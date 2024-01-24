package Concepts;

interface Car {
    void drive();
}

class Mercedes implements Car {
    public void drive() {
        System.out.println("Wrooooom... Mercedes Going!!!");
    }
}

class Thar implements Car {
    public void drive() {
        System.out.println("Wrooooom... Mahindra Thar Going!!!");
    }
}

class Human {
    public void ride(Car c) {
        c.drive();
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Car c1 = new Thar();
        Car c2 = new Mercedes();

        Human h = new Human();
        h.ride(c1);
        h.ride(c2);
    }
}
