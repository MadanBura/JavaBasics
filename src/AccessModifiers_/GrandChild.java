package AccessModifiers_;

import AccessModifiers.ChildClass;

public class GrandChild extends ChildClass {
    public void display() {
        System.out.println(publicVar); // Accessible
        System.out.println(protectedVar); // Accessible
        // System.out.println(defaultVar); // Not Accessible
        // System.out.println(privateVar); // Not Accessible

        publicMethod(); // Accessible
        protectedMethod(); // Accessible
        // defaultMethod(); // Not Accessible
        // privateMethod(); // Not Accessible
    }
}
