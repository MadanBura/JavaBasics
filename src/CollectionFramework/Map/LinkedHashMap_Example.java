package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Example {

    /*
    LinkedHashMap
        Order: It preserves insertion order, i.e; they maintain order as they are inserted
        Nulls: Allows one null key and multiple null values.
        Use Case: Useful when you need to maintain a predictable iteration order,
     */


    /*
    LinkedHashMap maintains insertion order by using a doubly-linked list in addition to the hash table.
     Each entry in the LinkedHashMap contains pointers to the next and previous entries,
      which allows the map to maintain the order of elements as they are inserted.
     */

    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Adding elements
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Accessing elements
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Checking if a key or value exists
        boolean hasBanana = map.containsKey("Banana");
        boolean hasValue10 = map.containsValue(10);
        System.out.println("Map contains key 'Banana': " + hasBanana);
        System.out.println("Map contains value 10: " + hasValue10);

        // Iterating over the map
        System.out.println("Iterating over the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing an element
        map.remove("Banana");
        System.out.println("LinkedHashMap after removing key 'Banana': " + map);

        // Replacing a value
        map.replace("Cherry", 40);
        System.out.println("LinkedHashMap after replacing value for key 'Cherry': " + map);

        // Checking the size of the map
        System.out.println("Size of the LinkedHashMap: " + map.size());

        // Checking if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("LinkedHashMap is empty: " + isEmpty);

        // Clearing the map
        map.clear();
        System.out.println("LinkedHashMap after clearing: " + map);
    }


}
