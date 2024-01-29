package Concepts;

class Eat extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Eating");
        }
    }
}

class Drink extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Drinking");
        }
    }
}

public class ThreadIntro {

    public static void main(String[] args) {

        /*
         * 1. To make an Object as a thread, the respective class should extend
         * "Threads" class
         * 
         * 2. To execute a thread, it should be started first using "start" method and
         * the class should contain "run" method which will get executed
         * 
         * 3. In both the run methods defined in classes above, As the iterations are
         * 100, you will be able to see alternative outputs of
         * the strings "Eating" and "Drinking"
         */
        Eat e = new Eat();
        e.start();

        Drink d = new Drink();
        d.start();
    }
}
