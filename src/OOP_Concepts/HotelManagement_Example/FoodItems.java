package OOP_Concepts.HotelManagement_Example;

public class FoodItems {

    private String name;
    private double price;

    public FoodItems(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayFoodItems() {
        System.out.println("Food Item: " + name + ", Price: $" + price);
    }
}
