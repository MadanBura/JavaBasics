package CollectionFramework.Set;

import java.util.HashSet;

public class Hashset_Example {

        /*
        HashSet:
            Uses a hash table (backed by a HashMap).
            No ordering of elements is guaranteed.

         */

    public static void main(String[] args) {

    // Create a HashSet
    HashSet<String> hashSet = new HashSet<>();

    // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Apple"); // Duplicate, will not be added

    // Display HashSet
        System.out.println("HashSet contents:");
        for(
    String item :hashSet)

    {
        System.out.println(item);
    }

    // Check if an element exists
        System.out.println("Contains Banana: "+hashSet.contains("Banana"));

    // Remove an element
        hashSet.remove("Date");
        System.out.println("After removing Date:");
        for(
    String item :hashSet)

    {
        System.out.println(item);
    }

    // Check size of HashSet
        System.out.println("Size of HashSet: "+hashSet.size());

    // Check if HashSet is empty
        System.out.println("Is HashSet empty: "+hashSet.isEmpty());

    // Clear all elements
        hashSet.clear();
        System.out.println("After clearing:");
        System.out.println("Is HashSet empty: "+hashSet.isEmpty());
    }

}
