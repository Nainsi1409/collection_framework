import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockForEach {
    public static void main(String[] args) {
        Queue<Integer> username =new PriorityBlockingQueue<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Priority Block ForEach");
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

        for (Integer i : username) {
            System.out.println(i);
        }
}
}
