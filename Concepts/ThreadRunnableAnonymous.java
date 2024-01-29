package Concepts;

public class ThreadRunnableAnonymous {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Talking...");

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {

            for (int i = 0; i < 50; i++) {
                System.out.println("Arguing...");

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
