import java.util.Iterator;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class NonGenericPriorityHasNext {

    public static void main(String[] args) {
        PriorityQueue username =new PriorityQueue();
        System.out.println("NAINSI BANGAR");
        System.out.println("NonGeneric Priority Block Has Next");
        username.add(50);
        username.add(58);
        username.add(15);

        // Printing the top element of the PriorityBlockingQueue
        System.out.println(username.peek());

        // Printing the top element and removing it from the PriorityBlockingQueue
        System.out.println(username.poll());

        //finding size of Queue
        int size = username.size();
        System.out.println("Size of queue : " + size);

        Iterator it = username.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
