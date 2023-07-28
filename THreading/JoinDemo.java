public class JoinDemo extends Thread {
    static Thread mainthread;

    public void run() {
        try {
            mainthread.join();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        mainthread = Thread.currentThread();
        JoinDemo demo = new JoinDemo();
        demo.start();
        try {
            demo.join();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
