package DataTypes_Variables;


//Demonstrating Java Data types-> Primitives and Non-Primitives

public class DataTypes_Example {

    public static void main(String[] args) {

        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 123456;
        long longVar = 1234567890L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159265358979;
        char charVar = 'A';
        boolean booleanVar = true;

        // Reference data types
        String stringVar = "Hello, Java!";
        int[] intArray = {1, 2, 3, 4, 5};

        //Custom class
        Human human = new Human("Malay", 24);

        System.out.println("Primitive Data Types:");
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);

        //Printing the size of primitives
        System.out.println("Size of byte: " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits");
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.SIZE + " bits");
        System.out.println("Size of boolean: Not precisely defined, but typically 1 bit");

        System.out.println("\nReference Data Types:");
        System.out.println("stringVar: " + stringVar);
        System.out.print("intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nCustom class:");
        System.out.println("Person name: " + human.getName_());
        System.out.println("Person age: " + human.getAge());


    }

}

class Human {

    private String name_;
    private int age;


    public Human(String name_, int age) {
        this.name_ = name_;
        this.age = age;
    }


    //getter and Setters
    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
