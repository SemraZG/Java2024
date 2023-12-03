package oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.getAge());//12--> get ile saklanmis datayi(private yaparak sakladik) okuduk

        s.setAge(13);
        System.out.println(s.getAge());//13-->
        // degistirildikten sonraki (setter ile degistirdik, parantezin ici yeni paramaetre istedi 13 verdik) datayi yazdirdi

        s.setSuccesfull(false);
        System.out.println(s.isSuccesfull());
    }
}
