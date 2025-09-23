package Level2;

public class MovieTicketDemo {

    // MovieTicket class definition
    static class MovieTicket {
        String movieName;
        int seatNumber;
        double price;

        // Method to book a ticket
        void bookTicket(String movieName, int seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        }

        // Method to display ticket details
        void displayTicket() {
            System.out.println("Movie Ticket Details:");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : ₹" + price);
        }
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Book a ticket
        ticket.bookTicket("Oppenheimer", 27, 450.00);

        // Display ticket details
        ticket.displayTicket();
    }
}