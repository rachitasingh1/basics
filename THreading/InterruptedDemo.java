public class InterruptedDemo extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                // Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InterruptedDemo demo = new InterruptedDemo();
        demo.start();
        demo.interrupt();
    }
}
