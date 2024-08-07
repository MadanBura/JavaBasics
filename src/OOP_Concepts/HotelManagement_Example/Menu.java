package OOP_Concepts.HotelManagement_Example;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<FoodItems> foodItemsList;

    public Menu() {
        this.foodItemsList = new ArrayList<>();
    }

    public void addFoodItem(FoodItems foodItem) {
        foodItemsList.add(foodItem);
    }

    public List<FoodItems> getFoodItems() {
        return foodItemsList;
    }



    public void displayMenu() {
        System.out.println("Menu:");
        for (FoodItems item : foodItemsList) {
            item.displayFoodItems();
        }
    }
}
