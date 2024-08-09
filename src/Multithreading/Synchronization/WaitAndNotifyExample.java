package Synchronization;

public class WaitAndNotifyExample {

    private static final Object locK = new Object(); 

    public static void main(String[] args) {

        Thread one = new Thread(()->
        {
            try {
                firstMethod();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Thread two = new Thread(()->
        {
            try {
                secondMethod();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        one.start();
        two.start();
    }

    private static void firstMethod() throws InterruptedException{
        synchronized (locK){
            System.out.println("Hello from MethodOne ");
            locK.wait();
            Thread.sleep(5000);
            System.out.println("Resuming from Method One");
        }
    }


    private static void secondMethod() throws InterruptedException{
        synchronized (locK){
            System.out.println("Hello from MethodTwo ");
            locK.notify();
            Thread.sleep(2000);
            System.out.println("Method two completed....Notifying ");
        }
    }
}
