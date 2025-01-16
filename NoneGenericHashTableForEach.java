
import java.util.*;

public class NoneGenericHashTableForEach {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable hashtable = new Hashtable();
        System.out.println(" NoneGeneric HashTable ForEach");
        // Adding elements to the hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Iterating over the elements of the hashtable using for-each loop
        for (Object key : hashtable.keySet()) {
            Object value = hashtable.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}