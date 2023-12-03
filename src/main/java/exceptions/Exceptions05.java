package exceptions;

public class Exceptions05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?--evet
        int a=12;
        int b=1;
        String s="My Java";
        getCharFromString(s,a,b);
        getCharFromString2(s,a,b);

    }//main disi
    public static void getCharFromString(String s, int a,int b){
        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapmayiniz"+ e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(s.length()+"'den buyuk index eleman icermez"+e.getCause());
        }
    }

    //2.yol:

    public static void getCharFromString2(String s, int a, int b) {
        //Tum exception turlerini tek bir catch'te yakalamak icin "exception" adli parent kullanilir
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Bir istisna olustu " + e.getClass());
            //getClass() ile exception'nin turunu ogrenebilirsiniz
        }
    }




}
