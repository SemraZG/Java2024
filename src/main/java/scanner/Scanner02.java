package scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //kullanicidan 2 sayi alip 4 islem yapan kodu yaziniz
        Scanner input=new Scanner(System.in).useLocale(Locale.US);//useLocale(Locale.US)-->sayilari notali kabul eder, bunu yazmazsak virgulle kabul eder.
        System.out.println("Iki sayi giriniz");
        double firstNum=input.nextDouble();
        double secondNum= input.nextDouble();
        System.out.println("Toplam: "+(firstNum+secondNum));
        System.out.println("Cikarma: "+(firstNum-secondNum));
        System.out.println("Carpma: "+(firstNum*secondNum));
        System.out.println("Bolme: "+(firstNum/secondNum));


        //
    }
}
