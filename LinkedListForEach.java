import java.util.*;

public class LinkedListForEach {
    public static void main(String[] args) {
        LinkedList<String> userNames = new LinkedList<String>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Linked List For Each");
        userNames.add("nainsi");
        userNames.add("channa");
        userNames.add("shami");
        userNames.add("karishma");
        for (String i : userNames) {
            System.out.println(i);
        }
    }
}
