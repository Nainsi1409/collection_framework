import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class NonGenericLinkedHashSetHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic Linked Has Next");
        LinkedHashSet userNames = new LinkedHashSet();
        userNames.add("nainsi");
        userNames.add("bhoomika");
        userNames.add("savita");
        userNames.add("savita");
        userNames.add("yash");
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
