package FileHandling.OutputStream_Example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_Example {
    //used for primitves data type to save in file

    public static void main(String[] args) {

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\FILE_IO\\Primitives_IO.txt"));
            dos.writeInt(123);               // Writes an integer
            dos.writeFloat(4.56f);           // Writes a float
            dos.writeDouble(7.89);           // Writes a double
            dos.writeUTF("Data to be saved in File >> ");   // Writes a string in modified UTF-8 format
            System.out.println("Data written to File >> ");

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
