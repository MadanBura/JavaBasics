package OOP_Concepts.HotelManagement_Example;


//Encapsulation
public class Rooms {

    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;

    public Rooms(int roomNumber, String roomType, double price, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayAvailableRooms() {
        System.out.println("Room Number: " + roomNumber + ", Room Type: " + roomType + ", Available: " + isAvailable);
    }
}
