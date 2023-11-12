package lists;
import java.util.ArrayList;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek sayi olanları 11 olarak olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); //[23, 24, 12, 9, 3]

        //ArrayList'lerde indexOf() method'u, listenin icinde belirtilen ogenin ilk olusumunun indexini dondurur
        //Girilen elamanin index'ini verir.

        for (Integer w: list){
            if (w%2!=0){
                list.set(list.indexOf(w), 11);//w'nin oldugu indexe 11 koy demek.
                //set() methodu, listenin belirtilen indexteki elemani yeni bir eleman ile degistirir
            }
        }
        System.out.println(list);//[11, 24, 12, 11, 11]


        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //[J, a, v, a, v] ==> [J, a, v]
        List<Character> java=new ArrayList<>();
        java.add('J');
        java.add('a');
        java.add('v');
        java.add('a');
        java.add('v');
        List<Character> newJava=new ArrayList<>();
        for (Character w: java){
            if (!newJava.contains(w)){
                newJava.add(w);
            }
        }
        System.out.println(newJava);//[J, a, v]


    }
}
