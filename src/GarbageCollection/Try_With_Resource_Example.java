package GarbageCollection;

//The AutoCloseable interface in Java is part of the java.lang package
// and provides a way to ensure that resources are closed automatically when they are no longer needed.


//Try_With Resource
//it is mechanism used to handle resources which are getting closed automatically after end of this block
class Test_{
    public static void main(String[] args) {

        try(Try_With_Resource_Example t = new Try_With_Resource_Example("Database_File");
        Try_With_Resource_Example t1 = new Try_With_Resource_Example("JSON_File")){

        t.doingOperation();
        t1.doingOperation();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("End of the method >> ");




    }
}



public class Try_With_Resource_Example implements AutoCloseable {

    private String resource;

    public Try_With_Resource_Example(String resource) {
        this.resource = resource;
        System.out.println(resource+" is opened >> ");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing this "+resource+" >>");
    }

    public void doingOperation(){
        System.out.println(resource+" is doing operation >>> ");
    }
}
