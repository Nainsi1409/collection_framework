import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Array List HasNext");
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("nainsi");
        userNames.add("yashika");
        userNames.add("yash");
        userNames.add("devendra");
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
