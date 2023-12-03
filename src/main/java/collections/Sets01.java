package collections;

import java.util.*;

public class Sets01 {
        //Set'ler tekrarsiz (unique) datalari depolamak icin kullanilir
        //Ornegin; tc kimlik, parmak izi, e mail, ehliyet, il plaka no

        /*Java’da üç tür set vardır:

        1) HashSet:
        Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null’i eleman olarak kabul ederler

        2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir sorted set’tir.*/
        public static void main(String[] args) {
                //HashSet nasil olusturulur?
                HashSet<String> hs = new HashSet<>();
                hs.add("Ali");
                hs.add("Aliye");
                hs.add("Yusuf");
                hs.add("Semra");
                System.out.println(hs);//[Yusuf, Semra, Aliye, Ali]--HashSet oldugu icin yazdigimiz siraya veya natural ordera gore yapmadi
                hs.add("Ali");
                System.out.println(hs);//[Yusuf, Semra, Aliye, Ali--
                // Ali'ye tekrar ekledik ama Setlerde unique elamanlar olmasi gerektigi icin Ali'yi listeye almadi zaten var diye.

                //-------------------------ekstra bilgi-eleman eklemenin kisa yollari
                HashSet<String> hs2=new HashSet<>(Arrays.asList("Semra", "Ali","Yusuf"));
                System.out.println(hs2);
                hs2.add("Hasan");
                System.out.println(hs2);//[Hasan, Yusuf, Semra, Ali]
                //2. kisa yol
                Set<String> hs3 = Set.of("Ayse", "Ali", "Can");
                System.out.println(hs3);
                //hs3.add("Yusuf");//yusufu eklemez cunku Set.of ile olusturulanlar degistirilemez



                //LinkedHashSet nasil olusturulur?
                //generic type'lar primitive data type kabul etmez
                LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
                lhs.add(12);
                lhs.add(17);
                lhs.add(2);
                lhs.add(124);
                System.out.println(lhs);//[12, 17, 2, 124]
                //LinkHashSet oldugu icin yazdigimiz sureye gore ekledi, HashSette rastgele ekliyordu

                LinkedHashSet<Integer> ls = new LinkedHashSet();
                ls.add(14);
                ls.add(19);
                ls.add(17);
                ls.add(11);
                System.out.println(ls); //[14, 19, 17, 11]

                //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
                // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.
                lhs.retainAll(ls);
                System.out.println(ls);//[14, 19, 17, 11]
                System.out.println(lhs);//[17]

                //TreeSet nasil olusturulur?
                TreeSet<Character> ts=new TreeSet<>();
                ts.add('G');
                ts.add('Q');
                ts.add('Z');
                ts.add('R');
                ts.add('U');
                System.out.println(ts);//[G, Q, R, U, Z]
                //TreeSet oldugu icin natural ordera gore yazdirdi, bu yuzden en yavasi TreeSet dir.


                //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
                //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
                // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için, SortedSet türünden bir değişken oluşturmanız gerekir.

                //TreeSet<Character> ss=ts.subSet('G', 'U');-->hata verir bu sekilde
                SortedSet<Character> ss=ts.subSet('G', 'U');//G'den basla U'ya kadar olani yeni bir kume yap demek
                System.out.println(ss);//[G, Q, R]


        }


}

