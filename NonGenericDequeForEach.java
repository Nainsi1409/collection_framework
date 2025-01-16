import java.util.ArrayDeque;
import java.util.Deque;

public class NonGenericDequeForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC Deque FOR EACH ");
        Deque userNames = new ArrayDeque<>();
        userNames.add("yashika");
        userNames.add("nainsi");
        System.out.println(userNames.peek());
        userNames.poll();
        userNames.add("yash");
        userNames.add("pappu");
        System.out.println(userNames.peek());
        for (Object i : userNames) {
            System.out.println(i);
        }
    }
}
