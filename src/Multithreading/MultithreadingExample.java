import java.time.LocalTime;

public class MultithreadingExample {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(MultithreadingExample::demo1);
        Thread t2 = new Thread(MultithreadingExample::demo2);

        System.out.println(LocalTime.now());
        t1.start();
        t2.start();

        t1.join();
        System.out.println(LocalTime.now());

    }
    private static void demo1(){

        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("for Demo1 "+ i);
                //Thread.sleep(1500);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Demo one Completed============>");
    }

    private static void demo2(){

        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("for Demo2 "+ i);
                //Thread.sleep(1500);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Demo one Completed============>");
    }

}
