package accessModifier;

public class StudentRunner {
    public static void main(String[] args) {
        Student studentAli=new Student();
        System.out.println(studentAli.stdName);//Ali Can

        System.out.println(studentAli.adress);//adress protected--ayni package oldugu iicn ulastik, baska package olsaydi child olmadigi surece ulasamazdi
        System.out.println(studentAli.email);//email default--ayni package olmasaydi child olsa bile ulasamazdik

        System.out.println(studentAli);//toString olusturmadan ojce-->accessModifier.Student@36baf30c-->objeyi yazdirmadi, adres verdi
                                        // objenin kendisini gormek istiyorsak Student classra toString methodunu generate etmeliyiz

        System.out.println(studentAli);//Student{stdName='Ali Can', adress='Istanbul', email='alican@gmail.com'}

    }
}
