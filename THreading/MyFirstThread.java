/**
 * MyFirstThread
 */
public class MyFirstThread extends Thread {

    public void run() {
        System.out.println("Hello this is my first thread.");
        System.out.println(this.getName());
        this.setName("First hdgaksd thread");
        System.out.println(this.getName());
        System.out.println(isDaemon());
        System.out.println("child thread priority is : "+getPriority());
        System.out.println(currentThread().getState());
        
    }

    public static void main(String[] args) {
        MyFirstThread my = new MyFirstThread();
        my.setPriority(10);
        my.start();
        // my.start();
        System.out.println("main: "+Thread.currentThread().getName());
        System.out.println("main: "+Thread.currentThread().getState());
        System.out.println("main: "+Thread.currentThread().getPriority());
        System.out.println("is my custom thread alive ? : "+my.isAlive());
        // my.sleep(100000);
    }

}