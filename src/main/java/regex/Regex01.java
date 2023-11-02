package regex;

public class Regex01 {
    public static void main(String[] args) {
        String m = "Ali Can Kahraman 145678";
        //Regular Expression - duzenli ifade - Regex - Bir grup data’yi almak icin kullanilir

        /*
        Meshur Regex’ler:

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           Tum a, x, y harfleri ==> [axy]
            a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
        8) Tum kucuk harfler haric: ==> [^a-z]
        9) Tum harfler haric ==> [^a-zA-Z]

            Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
    */

        // m String’indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz
        String s = m.replaceAll("[0-9]", "*");

        //m Stringindeki rakam sayiisni bulunuz
        int s1=m.replaceAll("[^0-9]", "").length();
        System.out.println(s1);//6

        //
    }
}
