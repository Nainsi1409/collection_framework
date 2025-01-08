import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Deque Has Next");
        Deque<String> userNames = new ArrayDeque<>();
        userNames.add("nainsi");
        userNames.add("yash");
        userNames.add("yashika");
        userNames.add("dev");
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
