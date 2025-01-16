import java.util.concurrent.LinkedBlockingQueue;

public class NonGenericLinkedBlockingQueueForEach {
    public static void main(String[] args) {
        LinkedBlockingQueue username = new LinkedBlockingQueue();
        System.out.println("NAINSI BANGAR");
        System.out.println("Non Generic Linked Blocking Queue ForEach");
        username.add(20);
        username.add(10);
        username.add(75);

        // Printing the top element of the PriorityBlockingQueue
        System.out.println(username.peek());

        // Printing the top element and removing it from the PriorityBlockingQueue
        System.out.println(username.poll());

        //finding size of Queue
        int size = username.size();
        System.out.println("Size of queue: " + size);

        for (Object i : username) {
            System.out.println(i);
        }
    }
}
