import java.util.ArrayList;
class NonGenericArrayListForEach {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println(" Non Generic Array List ForEach");
        ArrayList userNames = new ArrayList();
        userNames.add("yashika");
        userNames.add("nainsi");
        userNames.add("yash");
        userNames.add("pappu");
        for (Object i : userNames) {
            System.out.println(i);
        }
    }
}


