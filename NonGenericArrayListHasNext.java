import java.util.ArrayList;
import java.util.Iterator;

public class NonGenericArrayListHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic Array List HasNext");
        ArrayList userNames = new ArrayList();
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

