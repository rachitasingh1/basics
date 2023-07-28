public class SleepMethodsDemo {
    public static void main(String[] args) throws InterruptedException{
        System.out.print("in main thread: ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Sleeping...");
        Thread.sleep(5000, 5);
        System.out.println("Alive again.");
    }
}
