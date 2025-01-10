import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapForEach {
    public static void main(String[] args) {
        Map<Integer, String> ih = new IdentityHashMap<Integer, String>();
        System.out.println("NAINSI BANGAR");
        System.out.println("IdentityHashMap For Each ");
        // Mapping string values to int keys using put() method
        ih.put(1, "Aryan");
        ih.put(2, "Is");
        ih.put(3, "A");
        ih.put(4, "Good");
        ih.put(5, "Boy");

        // Creating a new IdentityHashMap and copying
        Map<Integer, String> NewIh = new IdentityHashMap<>();
        NewIh.putAll(ih);
        // Displaying the new IdentityHashMap
        System.out.println("new Mappings are: " + NewIh);

// Inserting existing key along with new value previous value gets returned and stored in returned_value
        String returned_value = ih.put(4, "Bad");

        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);

        for (Map.Entry<Integer, String> i : ih.entrySet()) {
            System.out.println(i);
        }
    }
}
