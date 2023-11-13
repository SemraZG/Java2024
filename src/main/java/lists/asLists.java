package lists;

import java.util.Arrays;
import java.util.List;

public class asLists {
    public static void main(String[] args) {
        //Bir List olusturmak icin kisa yol


        List<Integer> myList = Arrays.asList(1,3,4,9,7);

        //asList kullanmanin bazi handikaplari vardir. Arka planda Array gibi calismaya baslar.
        // Bu yuzden List'in eleman sayisini degistiren methodlari kullanamazsiniz
        //ornegin remove(), add() gibi methodlari kullanamazsiniz
        //ama set() veya size() kullanabilirsiniz

        //myList.remove(0); //HATA calismaz
        //myList.add(5); //HATA
        myList.set(0, 5);
        System.out.println(myList); //[5, 3, 4, 9, 7]

        System.out.println(myList.size()); //5

        //List'lerin sagladigi bazi methodlari kullanmak istiyorsaniz ve eleman sayisini
        // degistirmeyecekseniz asList kullanabilirsiniz

    }
}
