public class ThreadPriorityExample {

    public static void main(String[] args) {
//
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Maximum Priority >> "+Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().getName() + " Say hi");
        System.out.println("Main Thread priority >> "+Thread.currentThread().getPriority()); //5 -> normal priority

        Thread userThread = new Thread(()->{
            System.out.println("User Thread Says Hi ");
        });

        userThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("User Thread Priority >> "+userThread.getPriority());
        userThread.start();


    }

}
//here main thread gets higher priority than max