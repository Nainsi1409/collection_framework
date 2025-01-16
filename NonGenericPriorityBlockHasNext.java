import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class NonGenericPriorityBlockHasNext {
    public static void main(String[] args) {
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic Priority Block HasNext");
        Queue username =new PriorityBlockingQueue();

        username.add(69);
        username.add(34);
        username.add(19);

        // Printing the top element of the PriorityBlockingQueue
        System.out.println(username.peek());

        // Printing the top element and removing it from the PriorityBlockingQueue
        System.out.println(username.poll());

        //finding size of Queue
        int size = username.size();
        System.out.println("Size of queue : -" + size);

        Iterator it = username.iterator ();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
