import java.util.HashSet;
import java.util.LinkedList;

public class HashSetForEach {
    public static void main(String[] args) {
        HashSet<String> userNames = new HashSet<String>();
        System.out.println("NAINSI BANGAR");
        System.out.println("HashSet For Each");
        /*uniq elememt*/
        userNames.add("nainsi");
        userNames.add("chandan");
        userNames.add("nainsi");
        userNames.add("ram");
        for (String i : userNames) {
            System.out.println(i);
        }
    }
}
