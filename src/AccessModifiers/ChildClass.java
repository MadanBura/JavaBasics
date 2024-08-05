package AccessModifiers;

public class ChildClass extends ParentClass{

        public void display() {

            System.out.println(publicVar);//parent class public variable is accessible
            System.out.println(protectedVar); // parent class protected variable is accessible
            System.out.println(defaultVar); // parent class default Variable is accessible
            //Parent class private variable is not accessible
            //System.out.println(privateVar); //

            publicMethod();//Accessible
            protectedMethod();//Accessible
            defaultMethod();//Accessible
            //privateMethod();// Not Accessible here

        }
}
