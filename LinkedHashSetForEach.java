import java.util.LinkedHashSet;

public class LinkedHashSetForEach {
    public static void main(String[] args) {
        LinkedHashSet<String> userNames = new LinkedHashSet<String>();
        System.out.println("NAINSI BANGAR");
        /*uniq elememt*/
        System.out.println("Linked HashSet For Each");
        userNames.add("nainsi");
        userNames.add("chandan");
        userNames.add("nainsi");
        userNames.add("ram");
        for (String i : userNames) {
            System.out.println(i);
        }
    }
}
