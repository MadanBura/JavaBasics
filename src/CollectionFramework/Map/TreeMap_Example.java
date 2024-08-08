package CollectionFramework.Map;

import java.util.Map;
import java.util.TreeMap;

/*
    Order: Sorts the keys according to their natural order (if they implement Comparable)
    or by a specified comparator provided at map creation time.
    Nulls: Does not allow null keys. Allows multiple null values.
    Use Case: Best suited when you need a map that maintains a sorted order of keys.
 */

//TreeMap provides sorted order by maintaining its entries in a balanced binary search tree,

public class TreeMap_Example {
        public static void main(String[] args) {
            // Creating a TreeMap
            Map<String, Integer> map = new TreeMap<>();

            // Adding elements
            map.put("Apple", 10);
            map.put("Banana", 20);
            map.put("Cherry", 30);

            // Accessing elements
            System.out.println("Value for key 'Apple': " + map.get("Apple"));

            // Checking if a key or value exists
            boolean hasBanana = map.containsKey("Banana");
            boolean hasValue10 = map.containsValue(10);
            System.out.println("TreeMap contains key 'Banana': " + hasBanana);
            System.out.println("TreeMap contains value 10: " + hasValue10);

            // Iterating over the map
            System.out.println("Iterating over the TreeMap:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Removing an element
            map.remove("Banana");
            System.out.println("TreeMap after removing key 'Banana': " + map);

            // Replacing a value
            map.replace("Cherry", 40);
            System.out.println("TreeMap after replacing value for key 'Cherry': " + map);

            // Checking the size of the map
            System.out.println("Size of the TreeMap: " + map.size());

            // Checking if the map is empty
            boolean isEmpty = map.isEmpty();
            System.out.println("TreeMap is empty: " + isEmpty);

            // Clearing the map
            map.clear();
            System.out.println("TreeMap after clearing: " + map);
        }
}

