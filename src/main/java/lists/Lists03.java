package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

        //Ornek 1:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        /*for each kullandiginizda listlerde eleman sayisini azaltamazsiniz

        Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya
        dizinin boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında,
        döngü hâlâ eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
        Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

        Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur. Yani bir dongu sayisi
        for each tarafindan ornegin 4 olarak ayarlanmissa, siz bir elemani silince o 4 uzerinden devam etmeye
        calisacagi icin tutarsizlik olusur */

        List<String> r=new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Samsun");
        r.add("Van");

        List<String> newR=new ArrayList<>();

        for (String w: r){
            if (!w.contains("a")){
                newR.add(w);
            }
        }
        System.out.println(newR);

        //2.way

        for (int i=0; i<r.size()-1; i++){
            if (r.get(i).contains("a")){
                r.remove(i);
                i--;
            }
        }
        System.out.println(r);


    }
}
