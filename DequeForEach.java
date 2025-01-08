import java.util.*;

public class DequeForEach {
    public static void main(String[] args) {
        Deque<String> userNames = new ArrayDeque<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Deque For Each");
        userNames.add("nainsi");
        userNames.add("channa");
        userNames.add("shami");
        userNames.add("karishma");
        for (String i : userNames) {
            System.out.println(i);
        }
    }
}
