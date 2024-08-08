package CollectionFramework.List;

import java.util.LinkedList;

public class Linkedlist_Example {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Adding an element at a specific index
        list.add(1, "Blueberry");

        // Accessing elements
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));

        // Modifying elements
        list.set(1, "Blackberry");
        System.out.println("Modified element at index 1: " + list.get(1));

        // Removing elements
        list.remove("Banana");

        // Iterating over the LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String element : list) {
            System.out.println(element);
        }

        // Other LinkedList methods
        list.addFirst("Apricot");
        list.addLast("Date");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("LinkedList after removing first and last elements: " + list);

        // Check if list contains an element
        boolean containsCherry = list.contains("Cherry");
        System.out.println("LinkedList contains 'Cherry': " + containsCherry);

        // Clearing the LinkedList
        list.clear();
        System.out.println("LinkedList after clearing: " + list);
    }
}

