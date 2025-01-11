

/* ThreadEx1.java: A simple program creating and invoking a thread object by
extending the standard Thread class. */
class MyThread0 extends Thread {

    public void run() {
        System.out.println("this thread is running ... ");
    }
}
class MyThreadFirst {
    public static void main(String [] args ) {
        System.out.println("MyThreadFirst ");
        MyThread0 t = new MyThread0();
        t.start();
    }
}