package methodCreation;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.Scanner;

public class MethodCreation02 {
    public static void main(String[] args) {

       int result1= carpim(3,5);
        System.out.println("result1 = " + result1);

        int result2=carpTopla(4,4,2);
        System.out.println("result2 = " + result2);

        girilenKelimeyiYazdir("Semra");
    }



    //2 sayiyu carpan method olusturun
    protected static int carpim(int a, int b){
        return a*b;
        //protected baska packagelardaki childlara aciktir, child olmayanlatra kapali
        //default ayni packagelara acik
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz
    private static int carpTopla(int a, int b, int c){
       return a * b +c ;
    }



    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz
    public static void girilenKelimeyiYazdir(String s){
       System.out.println(s);
    }

}
