package accessModifier;

public class Student {


    public String stdName="Ali Can";
    protected String adress="Istanbul";
    String email="alican@gmail.com";//hicbirsey yazmazsak access modifier default olur
    private String bsn="123456789";

    @Override//bsn private oldugu icin onu yazdirmadik, onu cikarmasaydik private olmasina ragmen yazdirirdi ve veri sizintisina sebep olurduk
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
