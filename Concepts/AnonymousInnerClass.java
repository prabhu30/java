package Concepts;

class Java
{
    public void show() {
        System.out.println("Hi, I am show method - VISIBLE");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Java obj = new Java() {
            public void show() {
                System.out.println("Hi, I am show method - ANONYMOUS");
            }
        };
        obj.show();
    }
}
