import java.util.SortedSet;
import java.util.TreeSet;

public class NonGenericSortedSetInterfaceForEach {
    public static void main(String[] args)
    {   System.out.println("NonGenericSortedSetInterfaceForEach");
        SortedSet ts = new TreeSet();

        ts.add(558);
        ts.add(8956);
        ts.add(6789);
        ts.add(890);
        ts.add(678);

        System.out.println(ts);

        ts.remove(558);
        System.out.println("Set after removing " + "558:" + ts);
        System.out.println("First set  :" + ts.getFirst());
        System.out.println("Reversed the set : " + ts.reversed());
        System.out.println(" Subset is : " + ts.subSet(558,890));

        // Iterating though the SortedSet
        for (Object value : ts)
            System.out.println(value);

    }
}

