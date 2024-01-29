package Concepts;

class Working extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Working");
        }
    }
}

class Relaxing extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Relaxing");
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {

        Working w = new Working();
        Relaxing r = new Relaxing();

        /*
         * 1. Using "setPriority" method, we can only suggest a scheduler to prioritize
         * a particular thread, but it depends on scheduler whether it considers the
         * suggestion or not, based on other tasks it should schedule
         */
        r.setPriority(10);

        w.start();
        r.start();
    }
}
