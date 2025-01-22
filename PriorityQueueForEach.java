import java.util.*;

public class PriorityQueueForEach {
    public static void main(String[] args) {
        PriorityQueue<String> userNames = new PriorityQueue<String>();
        System.out.println("NAINSI BANGAR");
        System.out.println("PriorityQueue For Each");
        userNames.add("nainsi");
        userNames.add("shital");
        userNames.element();
        userNames.peek();
        userNames.add("karishma");
        userNames.poll();
        userNames.remove();
        for (String i : userNames) {
            System.out.println(i);
        }
    }
}
