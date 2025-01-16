import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class NonGenericSortedSetInterfaceHasNext {

    public static void main(String[] args) {
        SortedSet ts = new TreeSet();
        System.out.println("NonGenericSortedSetInterfaceHasNext");

        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        ts.add("Korea");
        ts.add("India");
        ts.add("Japan");

        System.out.println(ts);
        ts.remove("Australia");
        System.out.println("Set after removing " + "Australia:" + ts);
        System.out.println(" Size of Set :" + ts.size());

        System.out.println("Iterating over set:");
        Iterator i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());

    }
}