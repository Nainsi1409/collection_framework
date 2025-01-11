
//Multithreading example with Synchronization:
//Here is the same example which prints counter value in sequence and every time we run it, it
//produces same result.
class PrinttDemo {
    public void printCount(){
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Counter --- " + i );
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}
class ThreadDemo1 extends Thread {
    private Thread t;
    private String threadName;
    PrinttDemo PD;
    ThreadDemo1( String name, PrinttDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run() {
        synchronized(PD) {
            PD.printCount();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void start ()
    {
        System.out.println("Starting " + threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
public class MultiThreadingWithSynchronization {
    public static void main(String args[]) {
        PrinttDemo PD = new PrinttDemo();
        System.out.println("Multithreading With Sychronization ");
        ThreadDemo1 T1 = new ThreadDemo1( "Thread - 1 ", PD );
        ThreadDemo1 T2 = new ThreadDemo1( "Thread - 2 ", PD );
        T1.start();
        T2.start();
// wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
