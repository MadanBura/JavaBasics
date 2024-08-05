package GarbageCollection;

class Test {

    public static void main(String args[]) {

        Person p = new Person("Malay");
        Person p1 = new Person("Malay");

        p = null;
        p1 = null;

        // Request garbage collection
        System.gc();

        // Wait for a bit to give the garbage collector time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}


public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    //Finalize method - it is called by garbage collector just before the object gets
    // garbage collected
    //From Java 9 Finalize method has been deprecated
    //It is recommended to use `try-with resources`
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " is being garbage collected.");
    }

}
