package FileHandling.InputStream_Examples;


import FileHandling.Employee;

import java.io.*;

public class ObjectInputStream_Example {

    public static void main(String[] args) {

        Employee employee=null;
        try {
            ObjectInputStream oInput = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\FILE_IO\\Employee.txt"));

            employee = (Employee) oInput.readObject();

            System.out.println(employee);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
