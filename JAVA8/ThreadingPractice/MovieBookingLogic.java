package ThreadingPractice;

public class MovieBookingLogic {
    int totalTicketsAvailable = 10;

    public synchronized void bookMovieTickets(int tickets) {
        if (totalTicketsAvailable > tickets) {
            System.out.println("Tickets booked.");
            totalTicketsAvailable -= tickets;
            System.out.println("Tickets remaining now: " + totalTicketsAvailable);
        } else {
            System.out.println("Tickets CANNOT be booked!! Only" + totalTicketsAvailable + " tickets are left.");
        }
    }
}
