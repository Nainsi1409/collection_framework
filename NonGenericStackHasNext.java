import java.util.Iterator;
import java.util.*;

public class NonGenericStackHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic Stack Has Next");
        Stack userNames = new Stack();
        userNames.push("nainsi");
        userNames.push("bhoomika");
        userNames.push("savita");
        userNames.push("yash");
        userNames.pop();
        Iterator it = userNames.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
