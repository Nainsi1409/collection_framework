import java.util.*;
import java.util.Iterator;

public class NonGenericVectorHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic Vector Has Next");
        Vector userNames = new Vector();
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


