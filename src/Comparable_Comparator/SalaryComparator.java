package Comparable_Comparator;

import java.util.Comparator;

///Comparator ----> It is used for Custom sorting (Compare one obj with another object by parameter)

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}
