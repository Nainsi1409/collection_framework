import java.util.*;

public class NonGenericLinkedListForEach
{
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC LINKED LIST FOR EACH ");
        LinkedList userNames = new LinkedList();
        userNames.add("yashika");
        userNames.add("nainsi");
        userNames.add("yash");
        userNames.add("pappu");
        for (Object i : userNames) {
           System.out.println(i);
    }
}

}
