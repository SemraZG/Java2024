package accessModifier;

public class Student02Runner {
    public static void main(String[] args) {
        System.out.println(Student02.stdName);//class ismiyle ulastik cunku stdName variable i static.
        Student02.staticMethod();//class ismiyle ulastik cunku staticMethod methodu  static.

        Student02 student02=new Student02();
        System.out.println(student02.age);//age static olmadigi icin once obje olusturduk, obje uzerinden age variableina ulasabildik
        student02.nonstaticMethod();
    }
}
