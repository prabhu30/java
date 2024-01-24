package Concepts;

abstract class AnonymousJava {
    public abstract  void sayHello();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousJava obj = new AnonymousJava() {
            public void sayHello() {
                System.out.println("Hello Java!!");
            }
        };

        obj.sayHello();
    }
}


