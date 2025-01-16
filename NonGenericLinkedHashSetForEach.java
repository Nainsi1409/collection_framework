import java.util.HashSet;
import java.util.LinkedHashSet;

public class NonGenericLinkedHashSetForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC LinkedHashSet FOR EACH ");
        LinkedHashSet userNames = new LinkedHashSet<>();
        userNames.add("yashika");
        userNames.add("nainsi");
        userNames.add("yash");
        userNames.add("pappu");
        userNames.add("yash");
        for (Object i : userNames) {
            System.out.println(i);
        }
    }
}
