package CollectionFramework.Map;


import java.util.HashMap;
import java.util.Map;

        /*
           Order: Does not guarantee any order of the keys.
           Nulls: Allows one null key and multiple null values.
           Use Case: Best suited when order does not matter and you need fast access and update time.
         */

public class HashMap_Example {

        public static void main(String[] args) {

            // Creating a HashMap
            Map<String, Integer> map = new HashMap<>();

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
            System.out.println("Iterating over the map:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Removing an element
            map.remove("Banana");
            System.out.println("Map after removing key 'Banana': " + map);

            // Replacing a value
            map.replace("Cherry", 40);
            System.out.println("Map after replacing value for key 'Cherry': " + map);

            // Checking the size of the map
            System.out.println("Size of the map: " + map.size());

            // Checking if the map is empty
            boolean isEmpty = map.isEmpty();
            System.out.println("Map is empty: " + isEmpty);

            // Clearing the map
            map.clear();
            System.out.println("Map after clearing: " + map);
        }


}