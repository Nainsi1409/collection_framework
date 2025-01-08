
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class  DictionaryHasNext{
    public static void main(String[] args) {
        // Creating a Dictionary object with generics
        Dictionary<Integer, String> dictionary = new Hashtable<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("  Dictionary HasNext");
        // Adding elements to the dictionary
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");

        // Custom iterator-like functionality using Enumeration
        Enumeration<Integer> keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            String value = dictionary.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}