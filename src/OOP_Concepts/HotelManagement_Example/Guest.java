package OOP_Concepts.HotelManagement_Example;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Person {

    private long guestId;
    private List<Orders> orders;

    public Guest(String name, int age, long contact) {
        super(name, age, contact);
        this.guestId = generateGuestId();
        this.orders = new ArrayList<>();
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public void displayPersonDetails() {
        System.out.println("Guest ID: " + guestId + ", Name: " + getName() + ", Contact: " + getContact());
        System.out.println("Orders:");
        for (Orders order : orders) {
            order.displayOrders();
        }
    }

    public long generateGuestId() {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        long randomNumber = min + (long) (Math.random() * (max - min));
        return randomNumber;

    }


}
