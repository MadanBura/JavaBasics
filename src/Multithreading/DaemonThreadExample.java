
class DaemonThreadHelper implements Runnable{

    @Override
    public void run() {
        int count = 0;

        while(count<100){

            try {
                System.out.println(count);
                //Thread.sleep(1000);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Daemon helper is Running...");
        }

    }
}
class UserThread implements Runnable{

    @Override
    public void run() {
        try{
           // Thread.sleep(3000);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        System.out.println("User helper is Running...");
    }
}

public class DaemonThreadExample {

    public static void main(String[] args) {

        Thread bgThread = new Thread(new DaemonThreadHelper());
        Thread usThread = new Thread(new UserThread());

        bgThread.setDaemon(true);
        bgThread.start();
        usThread.start();

    }

}
