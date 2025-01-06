import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueForEach {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> username = new LinkedBlockingQueue<>();
        System.out.println("NAINSI BANGAR");
        System.out.println("Linked Blocking Queue ForEach");
        username.add(20);
        username.add(10);
        username.add(75);

        // Printing the top element of the PriorityBlockingQueue
        System.out.println(username.peek());

        // Printing the top element and removing it from the PriorityBlockingQueue
        System.out.println(username.poll());

        //finding size of Queue
        int size = username.size();
        System.out.println("Size of queue-" + size);

        for (int i : username) {
            System.out.println(i);
        }
    }
}
