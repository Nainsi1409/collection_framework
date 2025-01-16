import java.util.*;

public class NonGenericSortedMapHasNext {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap sortedMap = new TreeMap();
        System.out.println("Non Generic Sorted Map Has Next ");
        System.out.println("Nainsi Bangar");
        // Adding elements to the sorted map
        sortedMap.put(3, "Apple");
        sortedMap.put(1, "Banana");
        sortedMap.put(2, "Orange");

        // Cast TreeMap to SortedMap
        SortedMap<Integer, String> castedSortedMap = (SortedMap<Integer, String>) sortedMap;

        // Get an iterator over the entries in the map
        Iterator<Map.Entry<Integer, String>> iterator = castedSortedMap.entrySet().iterator();

        // Iterate over the entries and print them
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}