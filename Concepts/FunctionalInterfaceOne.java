package Concepts;

// An interface which has only one abstract method is called functional interface
@FunctionalInterface
interface Balance {
    void displayBalance();
}

class Account implements Balance {
    public void displayBalance() {
        System.out.println("Bank Balance is ₹ 10,00,00,000");
    }
}

public class FunctionalInterfaceOne {
    public static void main(String[] args) {

        Balance obj = new Account();
        obj.displayBalance();

    }
}
