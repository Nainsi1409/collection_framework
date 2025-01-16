import java.util.*;

public class NonGenericPriorityQueueForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC PriorityQueue FOR EACH ");
        PriorityQueue userNames = new PriorityQueue();
        userNames.add("yashika");
        userNames.add("nainsi");
        System.out.println(userNames.peek());
        userNames.poll();
        userNames.add("yash");
        userNames.add("pappu");

        for (Object i : userNames) {
            System.out.println(i);
        }
    }
}
