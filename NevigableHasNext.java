
import java.util.*;

public class NevigableHasNext {
    public static void main(String[] args) {
        // Creating a TreeMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        System.out.println(" Nevigable Has Next");
        System.out.println("Nainsi Bangar");
        // Adding elements to the navigable map
        navigableMap.put(3, "Apple");
        navigableMap.put(1, "Banana");
        navigableMap.put(2, "Orange");

        // Getting an iterator for the entry set of the navigable map
        Iterator<Map.Entry<Integer, String>> iterator = navigableMap.entrySet().iterator();

        // Iterating over the elements of the navigable map using hasNext method
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}