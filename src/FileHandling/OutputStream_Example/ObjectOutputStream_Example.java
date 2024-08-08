package FileHandling.OutputStream_Example;

import FileHandling.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_Example {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Madan", 56789,25);

        try {
            ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\FILE_IO\\Employee.txt"));
            oStream.writeObject(emp);
            System.out.println("Serialized data is saved in file");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
