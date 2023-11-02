package ifStatementSwitchTernary;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar
        tum aylarin isimlerini yazdiran kodu yaziniz.

        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik

        Not: Switch condition(kosul) parantezi icerisine;
        1-String, 2- int, 3- byte, 4- short, 5- char girebilirsiniz

        Switch condition(kosul) parantezi icerisine;
        1- long, 2- boolean, 3- float, 4- double giremezsiniz

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ay numnarasini giriniz");
        int aySayisi= input.nextInt();
        switch (aySayisi){
            case 1:
                System.out.println("Jan");
            case 2:
                System.out.println("Feb");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("Aug");
            case 9:
                System.out.println("Sep");
            case 10:
                System.out.println("Okt");
            case 11:
                System.out.println("Nov");
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Gecerli ay nunmarasi giriniz");
        }
    }
}
