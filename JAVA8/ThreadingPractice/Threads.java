package ThreadingPractice;

public class Threads extends Thread {

    MovieBookingLogic logic;
    int seats;

    Threads(MovieBookingLogic logic, int seats) {
        this.logic = logic;
        this.seats = seats;
    }

    public void run() {
        logic.bookMovieTickets(seats);
    }

}
