import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class NonGenericDequeHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic  Deque Has Next");
        Deque userNames = new ArrayDeque();
        userNames.add("nainsi");
        userNames.add("bhoomika");
        userNames.add("savita");
        userNames.add("yash");
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
