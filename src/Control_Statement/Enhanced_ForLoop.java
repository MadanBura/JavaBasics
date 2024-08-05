package Control_Statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enhanced_ForLoop {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90};

        List<String> list = Arrays.asList("One", "Two","Three","Four", "Five", "Six");

        // for-each loop for array
        for(int a : arr){
            System.out.println(a);
        }

        for (String str : list){
            System.out.println(str);
        }


    }
}
