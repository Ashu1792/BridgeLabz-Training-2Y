package Level1;

public class HotelBookingDemo {
    static class HotelBooking {
        String guestName;
        String roomType;
        int nights;

        // Default constructor
        HotelBooking() {
            guestName = "Guest";
            roomType = "Standard";
            nights = 1;
        }

        // Parameterized constructor
        HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        // Copy constructor
        HotelBooking(HotelBooking other) {
            this.guestName = other.guestName;
            this.roomType = other.roomType;
            this.nights = other.nights;
        }

        void display() {
            System.out.println("Booking: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
        }
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Aarav", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        defaultBooking.display();
        customBooking.display();
        copiedBooking.display();
    }
}