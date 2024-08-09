package Synchronization;





public class SynchronizationDemo {

    public static int withdrawal = 0;
   public static int limit = 100000;

    public static void main(String[] args) {


       Thread one = new Thread(SynchronizationDemo::withdrawalAmount);
       Thread two = new Thread(SynchronizationDemo::withdrawalAmount);

//
//        Thread one = new Thread(()->{
//            for (int i = 0; i < limit; i++) {
//                withdrawal++;
//            }
//        });
//
//        Thread two = new Thread(()->{
//            for (int i = 0; i < limit; i++) {
//                withdrawal++;
//            }
//        });

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Amount Withdrawn > "+ withdrawal);

    }

    private synchronized static void withdrawalAmount(){
        for (int i = 0; i < limit; i++) {
            withdrawal++;
        }
    }

}
