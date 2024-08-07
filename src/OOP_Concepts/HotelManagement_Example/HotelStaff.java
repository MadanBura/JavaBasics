package OOP_Concepts.HotelManagement_Example;

//Inheritance
public class HotelStaff extends Person {

    private int staffId;

    public HotelStaff(String name, int age, long contact, int staffId) {
        super(name, age, contact);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }


    @Override
    public void displayPersonDetails() {
        System.out.println("Staff ID: " + staffId + ", Name: " + getName() + ", Contact: " + getContact());
    }
}
