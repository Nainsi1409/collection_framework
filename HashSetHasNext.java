import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("HashSet Has Next");
        HashSet<String> userNames = new HashSet<>();
        userNames.add("nainsi");
        userNames.add("yash");
        userNames.add("yashika");
        userNames.add("yashika");
        userNames.add("dev");
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
