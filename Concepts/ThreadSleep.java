package Concepts;

class Studying extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Studying");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Running extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Running");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSleep {

    public static void main(String[] args) {

        /*
         * Thread.sleep(milliseconds) can be used to make a thread sleep for sometime
         * 
         * In this scenario, we tried using thread.sleep() method in order to get
         * alternative output strings, but it doesn't work as expected sometimes.
         */
        Studying st = new Studying();
        Running sl = new Running();

        st.start();
        sl.start();
    }
}
