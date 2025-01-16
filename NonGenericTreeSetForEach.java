import java.util.LinkedHashSet;
import java.util.TreeSet;
public class NonGenericTreeSetForEach {
    public static void main(String[] args) {

        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC TreeSet FOR EACH ");
        TreeSet userNames = new TreeSet<>();
        userNames.add("yashika");
        userNames.add("nainsi");
        userNames.add("pranay");
        userNames.add("gurpreet");
        userNames.add("tejasvi");
        for (Object i : userNames) {
        System.out.println(i);
    }
}
}
