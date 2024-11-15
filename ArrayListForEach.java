import java.util.ArrayList;

public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> userNames = new ArrayList<String>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Array list For Each");
        userNames.add("nainsi");
        userNames.add("yashika");
        userNames.add("pappu");
        userNames.add("yash");
        for (String i : userNames) {
            System.out.println(i);
        }
    }
}
