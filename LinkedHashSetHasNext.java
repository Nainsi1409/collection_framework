import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("LinkedHashSet Has Next");
        LinkedHashSet<String> userNames = new LinkedHashSet<>();
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
