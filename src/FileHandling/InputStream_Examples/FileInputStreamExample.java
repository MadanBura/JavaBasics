package FileHandling.InputStream_Examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {

        //step 1.Create A file with name
        //2. pass that file path into reading stream
        //3. intialize integer value while reading if line end it returns -1
        //4. cast int to char read

        try {
            String fileName = "C:\\Users\\User\\Desktop\\ABC.txt";
            FileInputStream fp = new FileInputStream(fileName);
            int i =0;
            while((i=fp.read()) != -1){
                System.out.print((char) i);
            }
            fp.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
