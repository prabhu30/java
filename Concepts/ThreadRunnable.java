package Concepts;

class Walking implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Walking...");

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Jogging implements Runnable {
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Jogging...");

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadRunnable {

    public static void main(String[] args) {

        Runnable w = new Walking();
        Runnable j = new Jogging();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(j);

        t1.start();
        t2.start();
    }
}
