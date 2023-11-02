package scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /**
         * 1.step: Scanner classdan obje olusturun--Scanner input=new Scanner(System.in);
         * 2.step: Kullaniciya ne istendigine dair mesaj verin--System.out.println("Yasinizi giriniz");
         * 3.step: Uygun method kullanilarak kullanicinin verdigi data memorye yerlestirilir--byte age=input.nextByte();
         */
        //kullanicidan ad' soyad,yas boy kilo bilgisi alip yazdirin.
        Scanner input=new Scanner(System.in);

        System.out.println("adinizi girin");
        String name=input.nextLine();

        System.out.println("Yasinizi giriniz");
        byte age=input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height=input.nextFloat();

        System.out.println("Kilonuzu girinz");
        short weight= input.nextShort();

        System.out.println("medeni durumunuzu girniz");
        String maritalStatus=input.next();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
    }
}
