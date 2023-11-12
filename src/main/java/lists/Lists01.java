package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        /**Array List Nedir?
        ArrayList, dinamik bir dizi yapısıdır. Bu, ArrayList'in boyutunun, elemanlar ekleme veya çıkarma sırasında otomatik olarak ayarlanabileceği anlamına gelir.

        ArrayList, primitive'leri depolayamaz çünkü primitive'ler, referans türleri değildir. Referans türleri, bir Objeye işaret eden bir referanstır. Primitive'ler ise doğrudan bir değerdir.

        Gerçek hayattan bir örnek olarak, bir alışveriş listesi ArrayList olarak temsil edilebilir. Alışveriş listesi, ürünlere ait isimlerin bir listesini içerir. Ürünler, String referans türleridir.

        1)Array’ler primitive data type’lari ve reference’lari depolayabilir ama Arraylist’ler non-primitive’leri (reference’lari) depolar
        2)ArrayListler memory’de Array’lerden daha fazla yer kaplar
        3)Array’ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
        4)ArrayList’ler eleman sayisinda esnektirler.

        5) Arrayleri Java niye iptal etmedi?
            a) Array’ler cok daha hizlidir
            b) Array’ler memory’de cok az yer kaplarlar
            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array’ler tercih edilir

        6) Java’da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.) doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda, bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.

        */

        //ArrayList nasil olusturulur?
        //ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi 2. taraftaki <Integer> zorunluydu, 6dan sonra yazasak da olur.
        ArrayList<Integer> ages=new ArrayList<>();

        //Listlere eleman ekleme
        ages.add(9);
        ages.add(12);
        ages.add(16);
        System.out.println(ages);//[9, 12, 16]--> Arraylerde Arrays.toString ile yazdiriyorduk burda direk yazdirabiliyoruz

        //Listlerde araya eleman eklemek icin index numarasini yazariz
        ages.add(1,28);
        System.out.println(ages);//[9, 28, 12, 16]

        //en sona eleman ekleme
        ages.add(64);
        System.out.println(ages);//[9, 28, 12, 16, 64]

        //Verilen Integer List'i ages List'inin icine koyunuz
        List<Integer> newAges=new ArrayList<>();
        //Sol tarafta ArrayList yazmak yerine direk List de kullanabiliriz, List ust siniftir bu sekilde yazmak daha kapsayici oldugu icin daha iyidir
        newAges.add(1);
        newAges.add(2);
        newAges.add(8);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 28, 12, 16, 64, 1, 2, 8]-->index belirtmezsek en sona ekler belirtilen listi
        ages.addAll(0, newAges);
        System.out.println(ages);//[1, 2, 8, 9, 28, 12, 16, 64, 1, 2, 8]

        //size() methodu, listenin boyutunu dondurur.
        System.out.println(ages.size());//11

        //get() methodu, listenin belirli bir konumundaki elemana erismek icin kullanilir
        System.out.println(ages.get(0));//0. indexteki elemani yazdir demek

        //set() methodu, listenin belirtilen indexteki elemani yeni bir eleman ile degistirir
        ages.set(1, 37);//1.indexte ne varsa onu 37 ile degistir demek
        System.out.println(ages.get(1));//37
    }
}
