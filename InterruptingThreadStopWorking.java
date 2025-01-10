class InterruptingThreadStopWorking extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            throw new RuntimeException("threadInturrupted:" + e);
        }
    }
    public static void main(String args[]){
            InterruptingThreadStopWorking t1=new InterruptingThreadStopWorking();
        System.out.println("Interrupting Thread  Stop Working");
        t1.start();
            try {
                t1.interrupt();
            }
            catch(Exception e){
                System.out.println("interrupt handled"+e);
            }
        }
    }