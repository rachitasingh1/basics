public class SleepDemo extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("THis is a child thread of main.");
                Thread.sleep(1000, 5);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        SleepDemo demo = new SleepDemo();
        demo.start();

    }
}
