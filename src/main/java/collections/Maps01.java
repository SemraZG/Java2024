package collections;

import java.util.*;
import java.util.Collections;

public class Maps01 {
    public static void main(String[] args) {

    //Map'ler sozluk gibidir. Aciklamalidir. orn: Ali = 13;--> Ali==Key, 13==Value
    //Sol taraf yani key'ler tekrarsiz yani unique dir. Value tarafi tekrarli olabilir
    //key tarafi icin set kullanilir cunku unigue datalar Setlerde saklanir
    // Value tarafi icinse List, data sayisindan eminsek Array kullanabiliriz
    //Map'in elemanlarina komple "entry set - giris elemani" denir

    //Map nasil olusturulur?

    //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
    //Map'lerde add calismaz cunku add eleman ekler, ben ise "entry set" ekleyecegim
    //Onun icin "put" kullanilir.
    HashMap<String, Integer> myMap=new HashMap<>();
    myMap.put("Ali can", 12);
    myMap.put("Aliye canan", 19);
    myMap.put("Sami can", 52);
    myMap.put("Ali candan", 29);
        System.out.println(myMap);//{Ali candan=29, Ali can=12, Aliye canan=19, Sami can=52}
        myMap.put("Ali can", 13);
        System.out.println(myMap);//{Ali candan=29, Ali can=13, Aliye canan=19, Sami can=52}
        // --Ali can nin valuesini guncelledi tekrar yazdirmadi cunku key ler unique olur

        //Sadece 'key' degerlerini nasil alabiliriz?
        //Bunun icin keySet() methodu kullanilir
        Set<String> keys=myMap.keySet();
        System.out.println(keys);//[Ali candan, Ali can, Aliye canan, Sami can]
        //Keyler unique oldugu icin keyleri alirken Set olusturmamiz lazim cunku setler unique degerler icindi

        // Sadece 'value' degerlerini nasil alabiliriz?
        // Bunun icin values() methodu kullanilir
        Collection<Integer> values=myMap.values();
        System.out.println(values);//[29, 13, 19, 52]
        //Valuleri alirken Collection sectik yani parenti secmis olduk, List veya Aarray de secebiliriz duruma gore

        //get(): Bir key'e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        Integer age=myMap.get("Ali can");
        System.out.println(age);//13


        //Ornek 1: myMap'deki kisilerin yaslarinin ortalamasi nedir?
        int sum=0;
        for (Integer w: values){//yukarida valueleri values'in icine atmistik zaten
            sum=sum+w;
        }
        System.out.println(sum/values.size());



        //entrySet() metodu, HashMap'in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis(entrySet()). Set’in icinde Map yapisi saklanir.
        System.out.println(myMap);//{Ali candan=29, Ali can=13, Aliye canan=19, Sami can=52}
       Set<Map.Entry<String, Integer>> myentrySet=myMap.entrySet();
        System.out.println(myentrySet);//[Ali candan=29, Ali can=13, Aliye canan=19, Sami can=52]
        //Map i Set e cevirdik --   Ali candan=29==tek bir data olarak kabul etti Sete ceviridkten sonra,
        //loopun icine Map koyamazken, Sete cevirdikten sonra artik forlarda kullanabilecegiz
        for ( Map.Entry<String, Integer> w: myentrySet){
            System.out.println(w);
            //Ali candan=29
            //Ali can=13
            //Aliye canan=19
            //Sami can=52----->verileri key-value olarak ayri ayri alabildik
            //Aksi takdirde direk Mapleri looplarda kullanamam--entrySet() methodu ile Sete cevirerek
        }



        //Ornek: Verilen Map'deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Java'da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.
        HashMap<String, Integer> kisiler=new HashMap<>();
        kisiler.put("Ali", 3);
        kisiler.put("Can", 5);
        kisiler.put("Ayse", 2);
        System.out.println(kisiler);//{Can=5, Ayse=2, Ali=3}
        int sum2=0;
        Set<Map.Entry<String, Integer>> kisilerSet=kisiler.entrySet();
        System.out.println(kisilerSet);//[Can=5, Ayse=2, Ali=3]
        for (Map.Entry<String, Integer> w: kisilerSet){
            sum2=sum2+w.getKey().length() + w.getValue();
            //ilk dongude w'nin icinde 'Can=5' var, w.getKey()'in icinde 'Can' var...
        }
        System.out.println(sum2);//20

    }
}
