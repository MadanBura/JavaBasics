package FileHandling;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empId;
    private String empName;
    private double salary;
    private int age;

    public Employee(int empId, String empName, double salary, int age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
