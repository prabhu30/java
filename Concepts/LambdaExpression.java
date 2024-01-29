package Concepts;

@FunctionalInterface
interface Programmer {
    void coding(String lang);
}

public class LambdaExpression {

    public static void main(String[] args) {

        Programmer p = (lang) -> System.out.println("Programmer is Programming... in " + lang);

        p.coding("Java");
    }
}
