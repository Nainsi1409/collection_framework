import java.util.LinkedHashMap;

public class LinkedHashMapForEach {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        System.out.println(" LinkedHashMapForEach");
        // Adding entries in Map using put() method
        lhm.put(1, "Aryan");
        lhm.put(2, "Aayush");
        lhm.put(4, "Rupali");

        // Getting and printing value for a specific key
        System.out.println("Getting value for key 'one': " + lhm.get(1));

        // Getting size of Map using size() method
        System.out.println("Size of the map: " + lhm.size());

        // Checking whether Map is empty or not
        System.out.println("Is map empty? " + lhm.isEmpty());

        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? " + lhm.containsKey(2));


        // Removing entry using remove() method
        System.out.println("delete element 'two': " + lhm.remove(2));

        // Note: It prints the elements in same order as they were inserted
        for (Integer i : lhm.keySet()) {
            System.out.println(i);
        }
    }
}
