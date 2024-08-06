package OOP_Concepts.Inheritance;

/// Single Inheritance ==> Employee --> Fulltime Employee
//                         Employee --> PartTime Employee
/// Hierarchical Inheritance ==> Employee --> Fulltime Employee,PartTime Employee
///MultiLevel Inheritance ==> Employee --> Fulltime Employee ---> Trainee Employee

///Multiple Inheritance ==> Employee ---> Fulltime Employee
//                          HolidayPerks, GiftVoucher ---> FullTimeEmployee


public abstract class Employee {

    protected String empName;
    protected int empId;
    protected double salary;

    public Employee(String empName, int empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    public abstract double calculateMonthlyPay();

    public String getName() {
        return empName;
    }

    public int getEmployeeId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

}

class FullTimeEmployee extends Employee implements GiftVoucher, HolidayPerk{

    private double annualBonus;

    public FullTimeEmployee(String empName, int empId, double salary, double annualBonus) {
        super(empName, empId, salary);
        this.annualBonus = annualBonus;
    }
    @Override
    public double calculateMonthlyPay() {
        return (salary + annualBonus / 12);
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public void giftVouchers(String message) {
        System.out.println("Gift Voucher for Diwali is :"+message);
    }

    @Override
    public void holidaysCalender(int daysCount) {
        System.out.println(daysCount+" days Holidays in year ");
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId, hourlyRate * hoursWorked); // Initial salary calculation
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlyPay() {
        return hourlyRate * hoursWorked;
    }
}

class Contractor extends Employee {
    private double contractAmount;

    public Contractor(String name, int employeeId, double contractAmount) {
        super(name, employeeId, contractAmount); // Salary in this case represents the total contract amount
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateMonthlyPay() {
        return contractAmount / 12; // Distributing the total contract amount over 12 months
    }

    public double getContractAmount() {
        return contractAmount;
    }
}

class TraineeEmployee extends FullTimeEmployee{

    protected double joiningBonus;

    public TraineeEmployee(String empName, int empId, double salary, double annualBonus, double joinningBonus) {
        super(empName, empId, salary, annualBonus);
        this.joiningBonus = joinningBonus;
    }

    @Override
    public double calculateMonthlyPay() {
        // Calculate monthly pay including the joining bo
        return (super.calculateMonthlyPay() + this.joiningBonus / 12);
    }

}

