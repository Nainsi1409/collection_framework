import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NonGenericNevigablehasNext {
    public static void main(String[] args) {
        // Creating a TreeMap
        NavigableMap navigableMap = new TreeMap();
        System.out.println("Non Generic Nevigable Has Next");
        System.out.println("Nainsi Bangar");
        // Adding elements to the navigable map
        navigableMap.put(3, "Apple");
        navigableMap.put(1, "Banana");
        navigableMap.put(2, "Orange");

        // Getting an iterator for the entry set of the navigable map
        Iterator<Map.Entry> iterator = navigableMap.entrySet().iterator();

        // Iterating over the elements of the navigable map using hasNext method
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
