public class JoinAnotherDemo extends Thread{

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("In my custom Thread.");
                Thread.sleep(5000);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JoinAnotherDemo demo= new JoinAnotherDemo();
        demo.start();
        System.out.println("In my Main Thread.");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("In Main Thread.");
                // Thread.sleep(5000);
                demo.join();
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
