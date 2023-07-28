public class BookingLogic {
    int totalTickets = 10;

    public void bookTickets(int tickets) {
        if (totalTickets > tickets) {
            System.out.println(tickets + " Tickets Booked.");
            totalTickets -= tickets;
        } else {
            System.out.println("Sorry. Tickets cannot be booked!!");
            System.out.println(totalTickets + " tickets left.");
        }
    }
}
