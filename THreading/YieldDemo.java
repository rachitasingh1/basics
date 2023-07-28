public class YieldDemo extends Thread {

    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("YieldDemo. Thread Name:" + Thread.currentThread().getName()
                    + "-Priority-" + Thread.currentThread().getPriority() + " i: " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("In main thread");
        
        for (int i = 0; i < 10; i++) {
            Thread.yield();
            System.out.println("Thread Priority:" + Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(MIN_PRIORITY);
            System.out.println("Thread Name:" + Thread.currentThread().getName() + Thread.currentThread().getPriority()
                    + " i: " + i);
        }
        YieldDemo demo = new YieldDemo();
        demo.start();
    }

}
