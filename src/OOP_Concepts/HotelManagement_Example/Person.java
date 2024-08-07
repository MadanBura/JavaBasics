package OOP_Concepts.HotelManagement_Example;


//Abstraction and Encapsulation
public abstract class Person {

    private String name;
    private int age;
    private long contact;

    //abstract method
    public abstract void displayPersonDetails();


    //Concrete
    public Person(String name, int age, long contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

}


