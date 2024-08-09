import java.time.LocalTime;

public class SequentialExample {
    public static void main(String[] args) {

        System.out.println(LocalTime.now());
        demo1();
        demo2();


        System.out.println(LocalTime.now());
    }

    private static void demo1(){
        for (int i = 0; i < 70; i++) {
            System.out.println("From Demo 1 "+i);
        }
    }

    private static void demo2(){
        for (int i = 0; i < 70; i++) {
            System.out.println("From Demo 2 "+i);
        }
    }

}
