
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class NonGenericDictionaryHasNext {
    public static void main(String[] args) {
        // Creating a Dictionary object without generics
        Dictionary dictionary = new Hashtable();
        System.out.println("NAINSI BANGAR");
        System.out.println(" NonGeneric Dictionary HasNext ");
        // Adding elements to the dictionary
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");

        // Custom iterator-like functionality using Enumeration
        Enumeration keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = dictionary.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}