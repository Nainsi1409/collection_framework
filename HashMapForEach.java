import java.util.HashMap;

public class HashMapForEach {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("HashMap For Each");
        // Adding elements to the Map using put() method
        map.put("Aryan", 20);
        map.put("Aayush", 18);
        map.put("Rupali", 22);

        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());

        // Access elements in the HashMap
        System.out.println(map.get("Aayush"));

        // Remove an element from the HashMap
        map.remove("Rupali");


        // Checking if a key is present and if present, print value by passing random element
        if (map.containsKey("Aryan")) {
            // Mapping
            Integer a = map.get("Aryan");

            // Printing value for the corresponding key
            System.out.println("value for key" + " 'Aryan' is:- " + a);
        }

        for (String i : map.keySet()) {
            System.out.println(i);
        }
    }
}
