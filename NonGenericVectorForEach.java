import java.util.*;

public class NonGenericVectorForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC VECTOR FOR EACH ");
        Vector userNames = new Vector();
        userNames.add("yashika");
        userNames.add("nainsi");
        userNames.add("yash");
        userNames.add("pappu");
        for (Object i : userNames) {
            System.out.println(i);
        }
    }

}
