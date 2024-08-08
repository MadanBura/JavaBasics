package FileHandling.OutputStream_Example;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput_Example {

    public static void main(String[] args) {


        String path = "C:\\Users\\User\\Desktop\\FILE_IO\\ABC.txt";
        try {
            BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(path));

            bf.write("HI >> This is India >> ".getBytes());
            bf.close();
            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
