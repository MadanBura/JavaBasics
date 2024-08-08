package FileHandling.InputStream_Examples;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_Example {

    public static void main(String[] args) {

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\FILE_IO\\Primitives_IO.txt"));
            int a = dis.readInt();
            float f = dis.readFloat();
            double d = dis.readDouble();
            String str = dis.readUTF();

            System.out.println(a);
            System.out.println(f);
            System.out.println(d);
            System.out.println(str);


        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
