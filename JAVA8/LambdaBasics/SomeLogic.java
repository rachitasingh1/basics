public class SomeLogic extends Thread{
    int total = 100;

    public void run() {

        for (int i = 0; i < 10; i++) {
            total += 100;
        }

    }

    public static void main(String[] args) throws InterruptedException{
        SomeLogic logic = new SomeLogic();
        logic.start();
        // logic.wait();
        Thread.sleep(5000);
        Thread.yield();
        logic.join();
        System.out.println("the total is : Rs. "+logic.total);
    }

}
