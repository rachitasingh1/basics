public class MovieBookingApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings te = new TotalEarnings();
        te.start();
        // System.out.println("Total Money is : Rs. "+te.total);
        synchronized (te) {
            te.wait(1);
            System.out.println("Total Money is : Rs. " + te.total);
        }
    }
}
