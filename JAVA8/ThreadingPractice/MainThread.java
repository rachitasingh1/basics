package ThreadingPractice;

public class MainThread {
    public static void main(String[] args) {
        MovieBookingLogic logic=new MovieBookingLogic();
        Threads t1= new Threads(logic, 7);
        t1.start();

        Threads t2= new Threads(logic, 8);
        t2.start();


    }
}
