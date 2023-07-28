public class DrivingTest extends Thread {
    public void run() {
        try {
            System.out.println("Driving Test starts.");
            Thread.sleep(7000);
            System.out.println("Driving Test completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
