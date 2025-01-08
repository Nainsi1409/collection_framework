
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class DictionaryForEach {
    public static void main(String[] args) {
        // Creating a Dictionary object
        Dictionary<Integer, String> dictionary = new Hashtable<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Dictionary For Each");
        // Adding elements to the dictionary
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");

        // Iterating over the elements of the dictionary using foreach loop
        for (Enumeration<Integer> keys = dictionary.keys(); keys.hasMoreElements();) {
            Integer key = keys.nextElement();
            String value = dictionary.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}