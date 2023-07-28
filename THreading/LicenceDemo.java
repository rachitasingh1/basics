public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException{
        // Thread main = Thread.currentThread();
        System.out.println("Hey.");
        Medical med = new Medical();

        med.start();
        med.join();
        Documents doc = new Documents();
        doc.start();
        doc.join();
        DrivingTest drive = new DrivingTest();
        drive.start();
        drive.join();

        System.out.println("All tasks completed.");
    }
}
