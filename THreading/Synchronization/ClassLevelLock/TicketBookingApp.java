public class TicketBookingApp extends Thread {
    BookingLogic logic;
    public void run() {
        logic.bookTickets(Tickets);
    }

    public static void main(String[] args) {
        BookingLogic logic = new BookingLogic();

    }
}
