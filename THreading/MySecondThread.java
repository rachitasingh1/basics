public class MySecondThread implements Runnable {
    public static void main(String[] args) {
        MySecondThread my = new MySecondThread();
        // my.run();
        Thread th = new Thread(my);
        th.start();
    }

    @Override
    public void run() {
        System.out.println("Hello from my second thread.");

    }
}
