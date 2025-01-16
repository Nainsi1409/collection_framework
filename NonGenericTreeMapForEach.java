import java.util.Map;
import java.util.TreeMap;

public class NonGenericTreeMapForEach {

    public static void main(String[] args) {
        Map treeMap = new TreeMap();
        System.out.println("NonGenericTreeMapForEach");
        treeMap.put("Akshita", 20);
        treeMap.put("Parmar", 18);
        treeMap.put("Abhijeet", 22);

        System.out.println("The size is "+treeMap.size());
        System.out.println("The vaues is " +treeMap.values());
        treeMap.remove("Abhijeet");

        for (Object key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}