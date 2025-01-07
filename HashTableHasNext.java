import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;

public class HashTableHasNext {
    public static void main(String[] args) {
        Hashtable<String, Integer>username = new Hashtable<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Hash Table has next");
        // Adding elements to the hashtable
        username.put("pran", 21);
        username.put("yashika", 20);
        username.put("nainsi", 18);

        // Getting values from the hashtable
        int va = username.get("");
        System.out.println("Value of yashika: " + va);

        // Removing elements from the hashtable
        username.remove("nainsi");

        // Enumerating the elements of the hashtable
        Enumeration<String> keys = username.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + username.get(key));
        }
    }
}
