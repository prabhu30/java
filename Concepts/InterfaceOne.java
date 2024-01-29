package Concepts;

/**
 * 1. Interface contains only abstract method declarations
 *
 * 2. A class which implements interface should either define all methods
 * of interface, or should be declared as abstract class
 *
 * 3. Data fields in interface are "static" and "final" by default. The values
 * cannot be changed. An object class which implements the interface will be
 * able to
 * access these data fields.
 *
 * 4. An interface can "extend" another interface
 *
 * 5. A class can implement multiple interfaces
 */
interface Programming {
    String language = "java";

    void coding();

    void creating();
}

interface Playing {
    void playGame();
}

class Student implements Programming, Playing {
    public void coding() {
        System.out.println("Hey, I am coding!!");
    }

    public void creating() {
        System.out.println("Hey, I am creating...");
    }

    public void playGame() {
        System.out.println("Hey, I am playing ;)");
    }
}

public class InterfaceOne {

    public static void main(String[] args) {

        Programming obj = new Student();
        obj.coding();
        obj.creating();

        Playing obj1 = new Student();
        obj1.playGame();

        // System.out.println(obj.language);
        System.out.println(Programming.language);
    }
}
