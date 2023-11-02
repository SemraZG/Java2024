package string;

public class String02 {
    public static void main(String[] args) {
        String s="Learn Java earn money";
        //money kelimesini dolar kelimesi ile cevirin
        String s1=s.replace("money", "dolar");
        System.out.println(s1);

        //tum e harflerini silin
        String s2=s.replace("e","");
        System.out.println(s2);//Larn Java arn mony


        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        tv=tv.replace("$","");
        String laptop = "$875.99";
        laptop=laptop.replace("$","");
       Double totalPrice= Double.valueOf(tv)+Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice);

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console'a yazdiriniz.
        // "   ali cAN   " ==> AC

        //trim() methodu bir String'deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String'i istediginiz karakterden parcalamaya yarar

        String name = "   ali     cAN   ";
        char first=name.trim().toUpperCase().charAt(0);//A
        char last= name.trim().toUpperCase().split(" ")[1].charAt(0);
        //char last= name.trim().toUpperCase().split("\\s+")[1].charAt(0);-->\\s+=birden fazla bosluk olsa da sec demek
        System.out.println(first+last);

    }
}
