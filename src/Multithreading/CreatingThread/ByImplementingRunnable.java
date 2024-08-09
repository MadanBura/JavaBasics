package CreatingThread;

class ThreadDemo implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Current Therad is "+ Thread.currentThread().threadId());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class ByImplementingRunnable {

    public static void main(String[] args){

        int n = 10;
        for (int i = 0; i < n; i++) {

            Thread newThread = new Thread(new ThreadDemo());
            newThread.start();
        }
    }
}
