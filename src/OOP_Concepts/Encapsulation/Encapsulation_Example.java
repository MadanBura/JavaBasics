package OOP_Concepts.Encapsulation;

//  Abstract Class Department having common functionality
// HR, SALES, DEVELOPEMENT, QA extends the Department Class
//And ORGANIZATION encapsulate all the Departments in one class

//Benefit ---> Data Hiding, Modularity, Aggregation


public class Encapsulation_Example {

    public static void main(String[] args) {

        HR_Dept hr = new HR_Dept("HR DEPT", "08", "TONY STARK");
        Sales_Dept sales = new Sales_Dept("Sales DEPT", "25", "SELLER");
        Development_Dept dev = new Development_Dept("Developement DEPT", "50", "GODFATHER");
        QA_Dept quality = new QA_Dept("QA DEPT", "35", "EXAM-SETTER");

        //Create instance of Organization
        Organization organization = new Organization(hr, sales, dev, quality);

        organization.displayOrganizationalInfo();
    }

}

class Organization{

    private HR_Dept hrDept;
    private Sales_Dept salesDept;
    private Development_Dept developmentDept;
    private QA_Dept qaDept;

    public Organization(HR_Dept hrDept, Sales_Dept salesDept, Development_Dept developmentDept, QA_Dept qaDept) {
        this.hrDept = hrDept;
        this.salesDept = salesDept;
        this.developmentDept = developmentDept;
        this.qaDept = qaDept;
    }

    public void displayOrganizationalInfo(){
       hrDept.Floor_Of_Dept("5th floor");
       salesDept.Floor_Of_Dept("7th floor");
       developmentDept.Floor_Of_Dept("2th floor");
       qaDept.Floor_Of_Dept("3th floor");
    }
}

abstract class Department{
    private String DeptName;
    private String DeptCount;

    public Department(String deptName, String deptCount) {
        DeptName = deptName;
        DeptCount = deptCount;
    }

    abstract void Floor_Of_Dept(String message);

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDeptCount() {
        return DeptCount;
    }

    public void setDeptCount(String deptCount) {
        DeptCount = deptCount;
    }

    public void getDeptDetails(){
        System.out.println("Department name is : "+getDeptName());
        System.out.println("Department Count is : "+getDeptCount());
    }

}

class HR_Dept extends Department{

    private String HR_Head;

    public HR_Dept(String deptName, String deptCount, String HR_Head) {
        super(deptName, deptCount);
        this.HR_Head = HR_Head;
    }

    @Override
    void Floor_Of_Dept(String message) {
        super.getDeptDetails();
        System.out.println("Floor of HR DEPT : "+message+" and Head is "+HR_Head);
    }

}

class Sales_Dept extends Department{
    private String Sale_Head;


    public Sales_Dept(String deptName, String deptCount, String sale_Head) {
        super(deptName, deptCount);
        Sale_Head = sale_Head;
    }

    @Override
    void Floor_Of_Dept(String message) {
        super.getDeptDetails();
        System.out.println("Floor of HR DEPT : "+message+" and Head is "+Sale_Head);
    }
}

class Development_Dept extends Department{

    private String devDept_Head;

    public Development_Dept(String deptName, String deptCount, String devDept_Head) {
        super(deptName, deptCount);
        this.devDept_Head = devDept_Head;
    }

    @Override
    void Floor_Of_Dept(String message) {
        super.getDeptDetails();
        System.out.println("Floor of HR DEPT : "+message+" and Head is "+devDept_Head);
    }
}

class QA_Dept extends Department{

    private String qa_Head;

    public QA_Dept(String deptName, String deptCount, String qa_Head) {
        super(deptName, deptCount);
        this.qa_Head = qa_Head;
    }

    @Override
    void Floor_Of_Dept(String message) {
        super.getDeptDetails();
        System.out.println("Floor of HR DEPT : "+message+" and Head is "+qa_Head);
    }
}
