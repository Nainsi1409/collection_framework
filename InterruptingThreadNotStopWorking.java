class InterruptingThreadNotStopWorking extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            System.out.println("Exception handled"+e);
        }
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        InterruptingThreadNotStopWorking t1=new InterruptingThreadNotStopWorking();
        System.out.println("Interrupting Thread Not Stop Working");
        t1.start();
        t1.interrupt();
    }
}