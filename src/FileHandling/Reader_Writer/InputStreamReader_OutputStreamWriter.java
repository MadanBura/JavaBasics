package FileHandling.Reader_Writer;

import java.io.*;

public class InputStreamReader_OutputStreamWriter {

    /*
     InputStreamReader converts bytes into characters using a specified character encoding,
     and OutputStreamWriter converts characters into bytes for writing to a file.
     */
    public static void main(String[] args) {

        String filePath = "C:\\Users\\User\\Desktop\\FILE_IO\\InputStreamReader_OutputStreamWriter.txt";

//       InputStreamReader_OutputStreamWriter.WriteIntoFile_Stream(filePath);
       InputStreamReader_OutputStreamWriter.ReadFromFile_Stream(filePath);
    }


    public static void WriteIntoFile_Stream(String filePath){

        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");
             BufferedWriter writer = new BufferedWriter(osw)) {
            String str = "I love my Country >> India ";
            writer.write(str);
            System.out.println("Success >> Data written using OutputStreamWriter");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void ReadFromFile_Stream(String filePath){

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
                BufferedReader reader = new BufferedReader(isr)) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.print(line);
            }
            System.out.println("\nSuccess >> Data read using InputStreamReader");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
