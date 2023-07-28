public class Documents extends Thread {
    public void run() {
        try {
            System.out.println("Document collection starts.");
            Thread.sleep(10000);
            System.out.println("Documents Collected.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
