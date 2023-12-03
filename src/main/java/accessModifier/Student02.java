package accessModifier;

public class Student02 {

    public static String stdName="Ali Can";//static variable==class variable
    public int age=18;//non-static variable==instance variable==object variable
    public static void staticMethod(){
        System.out.println("Static method");
    }
    public void nonstaticMethod(){
        System.out.println("Non-static method");
    }

}
