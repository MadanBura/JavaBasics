package OOP_Concepts.HotelManagement_Example;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private int orderId;
    private List<FoodItems> foodItems;
    private double totalPrice;

    public Orders(int orderId) {
        this.orderId = orderId;
        this.foodItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addFoodItem(FoodItems foodItem) {
        foodItems.add(foodItem);
        totalPrice += foodItem.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void displayOrders() {
        System.out.println("Order ID: " + orderId + ", Total Price: $" + totalPrice);
        System.out.println("Food Items:");
        for (FoodItems item : foodItems) {
            item.displayFoodItems();
        }
    }
}
