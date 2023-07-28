public class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical starts.");
            Thread.sleep(5000);
            System.out.println("Medical completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
