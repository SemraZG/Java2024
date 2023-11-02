package ifStatementSwitchTernary;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan 0'dan kucuk deger girmeyecek sekilde verileri alip,
        Eger calisan kadin ise;
         60 yasindan buyukse "Emekli olabilir" yazdirin
        Eger calisan erkek ise;
         65 yasindan buyukse "Emekli olabilir" yazdirin
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender");
        String gender=input.next();
        System.out.println("Please enter your age");
        int age= input.nextInt();
        if (age<0){
            System.out.println("Please enter a age more than 0");
        } else if (gender.equalsIgnoreCase("Kadin")) {
            if (age>60){
                System.out.println("Retired is possible");
            }else{
                System.out.println("Working should go on");
            }
        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age>65){
                System.out.println("Retired is possible");
            }else{
                System.out.println("Working should go on");
            }
        }else {
            System.out.println("There is no indefified for this age");
        }


    }
}
