package OOP_Concepts.HotelManagement_Example;

public class Bookings {

    private long bookingId;
    private Guest guest;
    private Rooms room;
    private String startDate;
    private String endDate;

    public Bookings(Guest guest, Rooms room, String startDate, String endDate) {
        this.bookingId = generateBookingId();
        this.guest = guest;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getBookingId() {
        return bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Rooms getRoom() {
        return room;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public long generateBookingId() {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        long randomNumber = min + (long) (Math.random() * (max - min));
        return randomNumber;

    }

    public void displayBookings() {
        System.out.println("Booking ID: " + bookingId + ", Guest: " + guest.getName() + ", Room: " + room.getRoomNumber() + ", Start Date: " + startDate + ", End Date: " + endDate);
    }


}
