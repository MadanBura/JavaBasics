package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> lstEmp = new ArrayList<>();

        lstEmp.add(new Employee(1001, "Madan", 50000, 123456));
        lstEmp.add(new Employee(1004, "Mayur", 32000, 123456));
        lstEmp.add(new Employee(1006, "Swapnil", 30000, 123456));
        lstEmp.add(new Employee(1002, "Harish", 49000, 123456));
        lstEmp.add(new Employee(1005, "Garry", 35000, 123456));
        lstEmp.add(new Employee(1003, "Sandy", 64000, 123456));


        System.out.println("Printing : (Original Order)");
        for(Employee e : lstEmp){
            System.out.println(e);
        }
        System.out.println();

        //Sorting by ID natural-order using method sort
        System.out.println("\nEmployees (Sorted by ID):");
        Collections.sort(lstEmp);
        for(Employee e : lstEmp){
            System.out.println(e);
        }
        System.out.println();

        Collections.sort(lstEmp, new SalaryComparator()); // Sorting by Salary
        System.out.println("\nEmployees (Sorted by Salary):");
        for (Employee e : lstEmp) {
            System.out.println(e);
        }


    }

}
