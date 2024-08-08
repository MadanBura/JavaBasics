package CollectionFramework.List;

import java.util.ArrayList;

public class ArrayList_Example{
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements into list
        list.add("swift");
        list.add("Alto");
        list.add("Creta");

        // Adding an element at a specific index
        list.add(1, "Ertiga");

        // Accessing elements using get method
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));

        // Modifying elements
        list.set(1, "Suzuki-Ertiga");
        System.out.println("Modified element at index 1: " + list.get(1));

        // Removing elements using remove
        list.remove("Alto"); // Remove by value
        list.remove(2); // Remove by index

        // Size of the list using Size
        System.out.println("Size of the list: " + list.size());

        // Iterating over the list
        System.out.println("Elements in the list:");
        for (String car : list) {
            System.out.println(car);
        }

        // Checking if the list contains an element
        boolean containsApple = list.contains("Creta");
        System.out.println("List contains 'Creta': " + containsApple);

        // Getting the index of an element
        int indexOfCherry = list.indexOf("swift");
        System.out.println("Index of 'swift': " + indexOfCherry);

        // Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("List is empty: " + isEmpty);

        // Clearing the list
        list.clear();
        System.out.println("List cleared. Size of the list: " + list.size());
    }
}
