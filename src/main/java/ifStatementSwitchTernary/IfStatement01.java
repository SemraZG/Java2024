package ifStatementSwitchTernary;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Kullanicidan alinan sayinin tek mi cift mi oldugunu yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num=input.nextInt();
        if (num % 2==0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek sayi");
        }

        //Kullanicidan gun sayiisni alip hangi gun oldugunu yazdirin
        System.out.println("Gun sayisini giriniz");
        int num2=input.nextInt();
        if (num2<=0){
            System.out.println("Gun sayilari 0'dan kuuck olamaz.");
        } else if (num2==1) {
            System.out.println("Pazar");
        }else if (num2==2) {
            System.out.println("Pazartesi");
        }else if (num2==3) {
            System.out.println("Sali");
        }else if (num2==4) {
            System.out.println("Carsamba");
        }else if (num2==5) {
            System.out.println("Persmbe");
        }else if (num2==6) {
            System.out.println("Cuma");
        }else if (num2==7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gun sayilari 7'den buyuk olamaz");
        }
    }
}
