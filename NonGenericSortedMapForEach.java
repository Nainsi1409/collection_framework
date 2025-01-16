
import java.util.*;

public class NonGenericSortedMapForEach {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap sortedMap = new TreeMap();
        System.out.println("Non Generic Sorted Map For Each");
        System.out.println("Nainsi Bangar");
        // Adding elements to the sorted map
        sortedMap.put(3, "Apple");
        sortedMap.put(1, "Banana");
        sortedMap.put(2, "Orange");

        // Cast TreeMap to SortedMap
        SortedMap<Integer, String> castedSortedMap = (SortedMap<Integer, String>) sortedMap;

        // Printing the sorted map using forEach loop
        castedSortedMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}