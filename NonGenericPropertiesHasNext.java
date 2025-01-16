
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

public class NonGenericPropertiesHasNext {
    public static void main(String[] args) {
        // Creating a Properties object
        Properties properties = new Properties();
        System.out.println("NonGenericPropertiesHasNext");
        // Adding properties to the object
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");

        // Get the key set
        Set<Object> keys = properties.keySet();

        // Create an iterator for the key set
        Iterator<Object> iterator = keys.iterator();

        // Iterate over the keys using hasNext() method
        while (iterator.hasNext()) {
            Object key = iterator.next();
            String value = (String) properties.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}