package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Example {

    /*
    LinkedHashSet:
        Uses a hash table and a linked list.
        Maintains insertion order using the linked list, which keeps track of the order of elements.
     */

    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");
        linkedHashSet.add("Apple"); // Duplicate, will not be added

        // Display LinkedHashSet
        System.out.println("LinkedHashSet contents:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // Check if an element exists
        System.out.println("Contains Banana: " + linkedHashSet.contains("Banana"));

        // Remove an element
        linkedHashSet.remove("Date");
        System.out.println("After removing Date:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // Check size of LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Check if LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty: " + linkedHashSet.isEmpty());

        // Clear all elements
        linkedHashSet.clear();
        System.out.println("After clearing:");
        System.out.println("Is LinkedHashSet empty: " + linkedHashSet.isEmpty());
    }

}
