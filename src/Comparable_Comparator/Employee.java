package Comparable_Comparator;

import org.jetbrains.annotations.NotNull;


//Comparable ----> It is used to compare current object with other object and sort

public class Employee implements Comparable<Employee>{

    private int empId;
    private String empName;
    private double salary;
    private long contactNo;

    public Employee(int empId, String empName, double salary, long contactNo) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.contactNo = contactNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", contactNo=" + contactNo +
                '}';
    }

    //sorting by ID
    @Override
    public int compareTo(@NotNull Employee o) {

        //OR we can Write like this
        /*
            if(this.id == o.id)
                return 0;
             else if(this.id > o.Id)
                return 1;
             else
                return -1
         */
        return Integer.compare(this.empId, o.empId);
    }

}
