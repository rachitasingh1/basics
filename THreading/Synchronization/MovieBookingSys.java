public class MovieBookingSys extends Thread {
    static BookTickets book;
    int seats;

    public void run() {
        book.bookTickets(seats);
    }

    public static void main(String[] args) {
        book = new BookTickets();
        MovieBookingSys person1 = new MovieBookingSys();
        person1.seats = 7;
        person1.start();

        MovieBookingSys person2 = new MovieBookingSys();
        person2.seats = 8;
        person2.start();

    }
}
