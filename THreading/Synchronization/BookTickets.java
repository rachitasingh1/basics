public class BookTickets {
    int totalTickets = 10;

    public void bookTickets(int num) {
        synchronized (this) {
            if (num < totalTickets) {
                System.out.println("Tickets Booked.");
                totalTickets -= num;
                System.out.println("Tickets Remaining: " + totalTickets);
            } else {
                System.out.println("Cannot Honour this Booking Request!!!");
                System.out.println("Tickets Remaining: " + totalTickets);
            }
        }
    }
}
