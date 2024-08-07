package OOP_Concepts.HotelManagement_Example;

import java.io.*;
import java.util.*;

// Encapsulation
public class HotelApplicationDemo {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String hotelName;
    private List<Guest> guestList;
    private List<HotelStaff> staffList;
    private List<Rooms> roomsList;
    private List<Bookings> bookingsList;
    private Menu menu;

    public HotelApplicationDemo(String hotelName) {
        this.hotelName = hotelName;
        this.guestList = new ArrayList<>();
        this.staffList = new ArrayList<>();
        this.roomsList = new ArrayList<>();
        this.bookingsList = new ArrayList<>();
        this.menu = new Menu();
    }

    // to register guest in hotel
    public Guest addGuest() {
        try {
            // Input for name
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            // Input for contact
            System.out.print("Enter your contact number: ");
            long contact = Long.parseLong(br.readLine());

            Guest guest = new Guest(name, age, contact);
            guestList.add(guest);
            return guest;
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
            return null;
        }
    }

    public void addStaff(HotelStaff staff) {
        staffList.add(staff);
    }

    public void addRoom(Rooms room) {
        roomsList.add(room);
    }

    public void addBooking(Bookings booking) {
        bookingsList.add(booking);
        booking.getRoom().setAvailable(false);
    }

    public void addFoodItemToMenu(FoodItems foodItem) {
        menu.addFoodItem(foodItem);
    }

    public List<Rooms> getRoomsList() {
        return roomsList;
    }

    public Menu getMenu() {
        return menu;
    }

    public void displayHotelDetails() {
        System.out.println("Welcome to Hotel: " + hotelName);
        System.out.println();
        System.out.println("Staff List >> ");
        for (HotelStaff staff : staffList) {
            staff.displayPersonDetails();
        }

        System.out.println("Rooms Details >> ");
        for (Rooms r : roomsList) {
            r.displayAvailableRooms();
        }

        System.out.println("Menu for food >> ");
        menu.displayMenu();
    }

    public static void main(String[] args) {

        HotelApplicationDemo hotel = new HotelApplicationDemo("VRINDAVAN");

        // Sample hotel staff
        HotelStaff staff1 = new HotelStaff("Garry", 23, 555558, 1111);
        HotelStaff staff2 = new HotelStaff("Harry", 23, 876540, 2222);
        HotelStaff staff3 = new HotelStaff("Parry", 23, 987665, 3333);

        hotel.addStaff(staff1);
        hotel.addStaff(staff2);
        hotel.addStaff(staff3);

        // Sample rooms
        Rooms singleBed = new Rooms(1001, "Single-Bed", 2000, true);
        Rooms doubleBed = new Rooms(1002, "Double-Bed", 3600, true);

        hotel.addRoom(singleBed);
        hotel.addRoom(doubleBed);

        // Sample food items
        FoodItems[] foodArray = {
                new FoodItems("Burger", 99),
                new FoodItems("Pizza", 129),
                new FoodItems("Fries", 49),
                new FoodItems("Soda", 39),
                new FoodItems("Salad", 79),
                new FoodItems("Taco", 89),
                new FoodItems("Pasta", 119),
                new FoodItems("Sandwich", 109),
                new FoodItems("Wings", 139),
                new FoodItems("Soup", 59)
        };

        for (FoodItems f : foodArray) {
            hotel.addFoodItemToMenu(f);
        }

        hotel.displayHotelDetails();

        boolean flag = true;

        while (flag) {
            try {
                System.out.println("To book your room >> press choice");
                System.out.println("1. Rooms ");
                System.out.println("2. Exit ");
                int choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        List<Rooms> listR = hotel.getRoomsList();
                        for (Rooms r : listR) {
                            r.displayAvailableRooms();
                        }

                        System.out.println("Select Room number >> ");
                        int roomNumber = Integer.parseInt(br.readLine());

                        Rooms selectedRoom = null;
                        for (Rooms room : listR) {
                            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                                selectedRoom = room;
                                room.setAvailable(false);
                                break;
                            }
                        }

                        if (selectedRoom != null) {
                            Guest guest1 = hotel.addGuest();

                            System.out.print("Enter start date >> ");
                            String startDate = br.readLine();

                            System.out.print("Enter end date >> ");
                            String endDate = br.readLine();

                            Bookings booking = new Bookings(guest1, selectedRoom, startDate, endDate);
                            hotel.addBooking(booking);

                            for (Bookings bookings : hotel.bookingsList) {
                                bookings.displayBookings();
                            }
                            System.out.println("Booking confirmed for Room " + roomNumber);
                            System.out.println();

                            System.out.println("Select payment method: ");
                            System.out.println("1. Credit Card");
                            System.out.println("2. Cash");
                            int paymentChoice = Integer.parseInt(br.readLine());
                            Payment payment = null;
                            double amount = selectedRoom.getPrice(); // Assuming room has a rate

                            switch (paymentChoice) {
                                case 1:
                                    System.out.print("Enter credit card number: ");
                                    long cardNumber = Long.parseLong(br.readLine());
                                    System.out.print("Enter card holder name: ");
                                    String cardHolderName = br.readLine();
                                    payment = new CreditCardPayment(cardNumber, cardHolderName);
                                    break;
                                case 2:
                                    payment = new CashPayment();
                                    break;
                                default:
                                    System.out.println("Invalid payment choice");
                                    break;
                            }

                            if (payment != null) {

                                //polymorphic behaviour
                                payment.processPayment(amount);
                            }

                        } else {
                            System.out.println("Room not available or not found.");
                        }
                        break;

                    case 2:
                        System.out.println("Thank you for using the Hotel Management System!");
                        flag = false;
                        break;

                    default:
                        System.out.println("Select a valid choice");
                        break;
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading input.");
                e.printStackTrace();
            }
        }
    }

}
