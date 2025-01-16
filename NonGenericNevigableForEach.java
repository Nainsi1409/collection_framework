import java.util.NavigableMap;
import java.util.TreeMap;

public class NonGenericNevigableForEach {
    public static void main(String[] args) {
        // Creating a TreeMap
        NavigableMap navigableMap = new TreeMap();
        System.out.println("Non Generic Nevigable For Each");
        System.out.println("Nainsi Bangar");
        // Adding elements to the navigable map
        navigableMap.put(3, "Apple");
        navigableMap.put(1, "Banana");
        navigableMap.put(2, "Orange");

        // Printing the navigable map using forEach loop
        navigableMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
