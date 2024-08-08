package FileHandling.Reader_Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\User\\Desktop\\FILE_IO\\Reader_Writer.txt";

        //FileReader_FileWriter.WriteIntoFile(filePath);
        FileReader_FileWriter.ReadFromFile(filePath);
    }


    public static void WriteIntoFile(String filePath){

        try(FileWriter fw = new FileWriter(filePath)){
            String str = "I love my COuntry >> India ";
            fw.write(str);
            System.out.println("Success >> ");
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
    public static void ReadFromFile(String filePath){

        try(FileReader fr = new FileReader(filePath)){
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
