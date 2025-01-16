import java.util.*;

public class NonGenericStackForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("NON GENERIC STACK FOR EACH ");
        Stack userNames = new Stack();
        userNames.push("yashika");
        userNames.push("nainsi");
        userNames.pop();
        userNames.push("yash");
        userNames.push("pappu");
        for (Object i : userNames) {
            System.out.println(i);
        }
    }
}
