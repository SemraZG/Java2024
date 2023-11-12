package loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        /**For loop;

          for (baslangic degeri ; loop calisma kurali; artirma/azaltma){
            //calisacak kodlar


        //while loop;

        baslangic degeri
        while (loop calisma kurali){
            //calisacak kodlar
            artirma/azaltma
        }
         */

        //iterasyon (dongu) sayisi net biliniyorsa for daha uygundur
        //Dongu sayisi onceden bilinmiyorsa while daha uygundur

        //Ornek 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz (3 ve 6 dahil)
        //1.yol: for loop
        for (int i=3; i<7; i++){
            System.out.println(i);
        }
        //2.yol: while loop
        int i=3;
        while (i<7){
            System.out.println(i);
            i++;
        }

        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil)
        int k=23;
        while (k>11){
            if (k%2==0){
                System.out.println(k);
            }
            k--;
        }

        //Ornek 1:  Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.
        /*     3 ==> 3x1=3
                     3x2=6
                     3x3=9
                     3x4=12 …
                     3x10=30*/

        Scanner input=new Scanner(System.in);
        System.out.println("Carpim tablosu icin bir sayi giriniz");
        int digit=input.nextInt();
        int s=1;
        while (s<11){
            if (digit>10){
                System.out.println("Please enter a digit between 1 and 10");
                break;
            }
            System.out.println(digit+"x"+s+"="+s*digit);
            s++;
        }


    }
}
