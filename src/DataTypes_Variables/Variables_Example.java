package DataTypes_Variables;


//Variables ---> A variable is a name of memory location, or it is container which holds the value while the java programme is executed.
//A variable is assigned with a data type.

public class Variables_Example {

    //1. Static Variable --> Class Level Variable
    //This is class level variables we can access it without creating instance
   // Memory allocation of static variable happens only once at the time of
    // class loading in memory
    static int staticVar = 100;

    //2. Instance variable ---> (Non-Static variable)
    //A variable declared inside class outside body of the method is called instance variable
    int instanceVar = 200;

    public void instanceMethod() {
        //3. Local Variable ---> This variable declared inside method body
        // this are having block scope, after end of this block, other
        // method in class aren’t even aware that the variable exist

        int localVar = 300;

        // Accessing instance and static variables within an instance method
        System.out.println("In the Instance Method:");
        System.out.println("Local variable: " + localVar);    // Local variable
        System.out.println("Instance variable: " + instanceVar); // Instance variable
        System.out.println("Static variable: " + staticVar); // Static variable
    }

    public static void staticMethod() {
        // Local variable
        int localVar = 400;

        // Accessing static variables within a static method
        System.out.println("In the Static Method:");
        System.out.println("Local variable: " + localVar);    // Local variable

        //Instance variable cannot be accessed directly in a static method
        //System.out.println("Instance variable: "+ instanceVar);
        System.out.println("Static variable: " + staticVar); // Static variable
    }



    public static void main(String[] args) {

        // Create an instance of the class
        Variables_Example ex = new Variables_Example();

        //call instance method
        ex.instanceMethod();

        //call static method
       // ex.staticMethod //<--- This will give error
        Variables_Example.staticMethod();

        // Accessing static variable directly using the class name
        System.out.println("Access static variable from main: " + Variables_Example.staticVar);

        // Accessing instance variable through an object
        System.out.println("Access instance variable from main: " + ex.instanceVar);
    }
}
