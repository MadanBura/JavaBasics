package Synchronization;


import java.util.concurrent.ThreadPoolExecutor;

class Sender{

    public void send(String message){

        System.out.println("Sending.... "+ message);

        try {

            for (int i = 0; i < 4; i++) {
                System.out.println("Waiting...");
                Thread.sleep(2000);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Message Sent Successfully");
    }
}


class ThreadDemo extends Thread{

    private String msg;
    Sender sender;

    public ThreadDemo(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {

        synchronized (sender){
            sender.send(msg);
        }
      //  sender.send(msg);

    }
}

public class SynchronizationExample {

    public static void main(String args[]) {

        Sender s = new Sender();

        ThreadDemo thread1 = new ThreadDemo("Hi", s);
        ThreadDemo thread2 = new ThreadDemo("How Are you !!!! ", s);

      ;

      thread1.start();
      thread2.start();


        // wait for threads to end
//        try {
//            thread1.join();
//            thread2.join();
//        }
//        catch (Exception e) {
//            System.out.println("Interrupted");
//        }



    }
}

///Synchronization done using
// 1. Synchronized Method
// 2. Synchronized Block
// 3. Static Synchronized Method
