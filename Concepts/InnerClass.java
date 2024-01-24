package Concepts;

// Outer Class
class Outer {

    int state;

    public void getCountry() {
        System.out.println("[Outer Class] Hey, Prabhu is in India.");
    }

    // Inner Class
    class Inner {

        public void getCity() {
            System.out.println("[Inner Class] Prabhu lives in Guntur city.");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.getCountry();

        // Creating object for Inner Class
        Outer.Inner innerObj = obj.new Inner();
        innerObj.getCity();
    }
}
