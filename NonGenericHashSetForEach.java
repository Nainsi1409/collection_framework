import java.util.*;

public class NonGenericHashSetForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC HashSet FOR EACH ");
        HashSet userNames = new HashSet<>();
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
