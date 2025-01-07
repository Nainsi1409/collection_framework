
import java.util.*;

public class HashTableForEach {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Hash Table For Each ");
        // Adding elements to the hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Iterating over the elements of the hashtable using entrySet and forEach loop
        hashtable.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        });
    }
}