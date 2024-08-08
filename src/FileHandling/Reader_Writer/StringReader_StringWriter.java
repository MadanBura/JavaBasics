package FileHandling.Reader_Writer;

import java.io.*;

public class StringReader_StringWriter {

    /*
     StringReader is used to read character data from a string as if it were a stream,
     and StringWriter is used to write character data to a string.
     */
    public static void main(String[] args) {

        String data = "I love my Country >> India";

    // StringWriter sw = StringReader_StringWriter.writeToString(data);
//        System.out.println("Written Data: " + sw.toString());

            StringReader_StringWriter.readFromString(data);
    }

    public static StringWriter writeToString(String data) {
        StringWriter sw = new StringWriter();

        sw.write(data);
        System.out.println("Success >> Data written using StringWriter");

        return sw;
    }

    public static void readFromString(String data) {
        StringReader sr = new StringReader(data);

        try {
            int cursor;
            while ((cursor = sr.read()) != -1) {
                System.out.print((char) cursor);
            }
            System.out.println("\nSuccess >> Data read using StringReader");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
