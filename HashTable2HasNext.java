import java.util.*;
public class HashTable2HasNext {

    public static void main(String[] args) {
        // Creating a Hashtable with generics
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("HashTable2 Has Next");
        // Adding elements to the hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Get Enumeration of keys
        Enumeration<Integer> keys = hashtable.keys();

        // Iterate over the elements of the hashtable using Enumeration
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            String value = hashtable.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}