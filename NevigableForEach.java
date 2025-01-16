
import java.util.*;

public class NevigableForEach {
    public static void main(String[] args) {
        // Creating a TreeMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        System.out.println(" Nevigable For Each");
        System.out.println("Nainsi Bangar");
        // Adding elements to the navigable map
        navigableMap.put(3, "Apple");
        navigableMap.put(1, "Banana");
        navigableMap.put(2, "Orange");

        // Printing the navigable map using forEach loop
        navigableMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}