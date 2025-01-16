
import java.util.*;

public class NonGenericHashTableHasNext {
    public static void main(String[] args) {
        // Creating a Hashtable without generics
        Hashtable hashtable = new Hashtable();
        System.out.println("NAINSI BANGAR");
        System.out.println("NonGeneric HashTable HasNext ");
        // Adding elements to the hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Get Enumeration of keys
        Enumeration keys = hashtable.keys();

        // Iterate over the elements of the hashtable using Enumeration
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = hashtable.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}