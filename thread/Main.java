package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread ID: " + Thread.currentThread().threadId());
        System.out.println("Thread Name: " + Thread.currentThread().getName());
       new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println(" New Thread ID : " + Thread.currentThread().threadId());
            for(int i=0;i<100;i++) {
                System.err.print(" 2");
           };
        }
       }).start();
       try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
       
        e.printStackTrace();
    }
       for(int i=0;i<100;i++) {
            System.err.print(1);
       };
       System.out.println("Main Ends");
    }
}
