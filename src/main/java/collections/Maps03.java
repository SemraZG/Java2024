package collections;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        /*Meshur bir interview sorusu

        ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

         Ali nasilsin Ali.---> Ali=2, nasilsin=1
         */
        String s="Ali nasilsin Ali.";
        s=s.replaceAll("\\p{Punct}", "").toLowerCase();//ali nasilsin ali
        String[] kelimeler= s.split(" ");//split methodu string array dondurur
        System.out.println(Arrays.toString(kelimeler));//[ali, nasilsin, ali]--->Array oldugu icin Arrays.toString ile yazdirdik
        //Arraye donusturdukten sonra loop ile dolasabiliriz
        HashMap<String, Integer> mapKelimeler=new HashMap<>();
        for (String w: kelimeler){
            Integer gorunum=mapKelimeler.get(w);//get() methidun icine key yazilir bize value yu dondurur
            if (gorunum==null){
                mapKelimeler.put(w,1);//w=1 seklinde ekle demek, w ilk durumda ali oldugu icin ali=1 eklemis oldu ilk dongude
            }else{
                mapKelimeler.put(w, gorunum+1);
            }
        }
        System.out.println(mapKelimeler);//{nasilsin=1, ali=2}

        //ODEV: ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz
        //"Hello" ==> H=1, e=1, l=2, o=1
        String h="Hello";
        String[] hArray=h.split("");
        HashMap<String, Integer> letters=new HashMap<>();
        for (String w: hArray){
            Integer gorunum=letters.get(w);
            if (gorunum==null){
                letters.put(w,1);
            }else{
                letters.put(w, gorunum+1);
            }
        }
        System.out.println(letters);//{e=1, H=1, l=2, o=1}
    }
}
