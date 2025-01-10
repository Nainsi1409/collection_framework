import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class IdentityHashMapHasNext {
    public static void main(String[] args) {
        Map<Integer, String> ih = new IdentityHashMap<Integer, String>();
        System.out.println("NAINSI BANGAR");
        System.out.println("IdentityHashMap has next ");
        // Mapping string values to int keys using put() method
        ih.put(1, "Aryan");
        ih.put(2, "Aayush");
        ih.put(3, "Rupali");

        // Creating a new Identityhash map and copying
        Map<Integer, String> NewIh = new IdentityHashMap<Integer, String>();
        NewIh.putAll(ih);
        // Displaying the new IdentityHashMap
        System.out.println("new Mappings are: " + NewIh);

// Inserting existing key along with new value previous value gets returned and stored in returned_value
        String returned_value = ih.put(2, "Rohit");
        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);

        Iterator it = ih.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

