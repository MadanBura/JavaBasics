package FileHandling.InputStream_Examples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput_Example {

    public static void main(String[] args) {

        /*
        BufferedInputStream: Wraps the FileInputStream, providing a buffer for reading.
        Instead of reading one byte at a time from the file, it reads a larger block into memory.
         */

        String filePath= "C:\\Users\\User\\Desktop\\FILE_IO\\ABC.txt";

        try {
            BufferedInputStream bf = new BufferedInputStream(new FileInputStream(filePath));

            int cursor;
            while((cursor=bf.read()) != -1 ){
                System.out.print((char) cursor);
            }

            bf.close();

            System.out.println(">>>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
