package FileHandling.OutputStream_Example;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStream_Example {

    public static void main(String args[]) {
        try {
            File newFile = new File("C:\\Users\\User\\Desktop\\ABC.txt");
            FileOutputStream fout = new FileOutputStream(newFile);
            //  fout.write("India is my country >> ".getBytes());
            String str = "India is my country ";
            byte[] b = str.getBytes();

            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
