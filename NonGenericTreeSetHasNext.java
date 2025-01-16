import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NonGenericTreeSetHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic TreeSet Has Next");
        TreeSet userNames = new TreeSet();
        userNames.add("nainsi");
        userNames.add("bhoomika");
        userNames.add("savita");
        userNames.add("sonakshi");
        userNames.add("yash");
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
