package AccessModifiers;

public class ParentClass {

    public int publicVar = 10;
    protected int protectedVar = 10;
    int defaultVar = 10;
    private int privateVar = 10;


    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}


