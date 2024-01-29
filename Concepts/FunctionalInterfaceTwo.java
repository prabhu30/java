package Concepts;

@FunctionalInterface
interface UserBalance {
    void displayBalance();
}

public class FunctionalInterfaceTwo {
    public static void main(String[] args) {

        UserBalance obj = new UserBalance() {
            public void displayBalance() {
                System.out.println("Your Balance is 10,00,00,000");
            }
        };
        obj.displayBalance();
    }
}
