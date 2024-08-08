package FileHandling.Reader_Writer;

import java.io.*;

public class BufferedReader_BufferedWriter {

    /*
     They provide buffering, which can improve the performance of reading and writing operations
     by reducing the number of I/O operations.
     */
    public static void main(String[] args) {

        String filePath = "C:\\Users\\User\\Desktop\\FILE_IO\\Reader_Writer_Buffered.txt";

//        BufferedReader_BufferedWriter.WriteIntoFile_Buffer(filePath);
        BufferedReader_BufferedWriter.ReadFromFile_Buffered(filePath);
    }


    public static void WriteIntoFile_Buffer(String filePath){

        try(BufferedWriter fw = new BufferedWriter(new FileWriter(filePath))){
            String str = "I love my COuntry >> India ";
            fw.write(str);
            System.out.println("Success >> ");
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
    public static void ReadFromFile_Buffered(String filePath){

        try(BufferedReader fr =new BufferedReader(new FileReader(filePath))){
            int cursor;
            while((cursor=fr.read())!= -1){
                System.out.print((char) cursor);
            }

            System.out.println("Success >> ");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }


}
