package regex;

import java.util.Scanner;

public class Regex02 {
    public static void main(String[] args) {
         /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lenghtControl=pwd.length()>7;
        System.out.println("lenghtControl = " + lenghtControl);

        //ii)Space karakteri password'de olmasin
        boolean spaceControl=pwd.replaceAll("[^ ]", "").length()==0;
        System.out.println("spaceControl = " + spaceControl);
        //boolean a=pwd.contains(" ");

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl=pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl=pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean digitControl=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("digitControl = " + digitControl);



        boolean isPwdValid=lenghtControl&&spaceControl&&
                upperCaseControl&&lowerCaseControl&&digitControl;
        if (isPwdValid){
            System.out.println("Password is valid.");
        }else{
            System.out.println("Password is not valid.");
        }



    }
}
