package CreatingThread;

class ThreadClassDemo extends Thread{
    @Override
    public void run() {

        try{
            System.out.println("Current Therad is "+ Thread.currentThread().threadId());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

public class ByExtendingThreadClass {
    public static void main(String args[]){

        int n=8;
        for (int i = 0; i < n; i++) {
            ThreadClassDemo obj = new ThreadClassDemo();
            obj.start();

            ThreadClassDemo obj1 = new ThreadClassDemo();

            Thread t = new Thread(obj1);
            t.start();
        }

    }

}
///  Start vs run
//  start will creat new obj and then invoke run on it
// but run will execute as normal method


