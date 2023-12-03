package collections;

import java.util.*;

public class Maps04 {
    //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*Thread safe (iş parçacığı güvenliği), bir yazılımın birden fazla iş parçacığı tarafından aynı anda
        güvenle kullanılabilmesidir. Thread safe bir yazılım örneği, bir banka hesabını yöneten bir
        sistemdir. Bu sistem, birden fazla müşterinin aynı anda hesabına erişebilmesine
        izin vermelidir ve bu nedenle thread safe olmalıdır.

        Multi thread (çok iş parçacıklı), bir yazılımın birden fazla iş parçacığı tarafından aynı anda
        çalıştırılmasıdır. Bu, yazılımın daha hızlı ve verimli çalışmasına izin verebilir.
        Multi thread bir yazılım örneği, bir web tarayıcısıdır. Bir web tarayıcısı,
        aynı anda birden fazla web sayfasını açabilir ve bu nedenle multi thread'dir.

        Synchronized olması ise, bir veri yapısının aynı anda sadece bir iş parçacığı
        tarafından kullanılabilmesi anlamına gelir.*/

        /*HashMap ile HashTable arasindaki fark nedir?

        1)  a) HashMap non-synchronized'dir.Yani, birden fazla iş parçacığı aynı anda bir
        HashMap'e erişebilir. Aynı anda birden fazla müşteri hesap bilgilerine erişebilir.
        Bu, örneğin bir müşteri para çekerken, başka bir müşteri aynı anda hesaba para yatırırsa,
        hesabın bakiyesinin yanlış olmasına yol açabilir.(thread-safe de degildir)
        Ancak bu durumda senkronizasyon işlemleri manuel olarak yönetilmelidir.
        (programci Synchronized Bloklar, Lock ve Semapforlar gibi ozel yapilar kullanir.)

            b) HashTable thread-safe ve synchronized’dir
        ( yani aynı anda sadece bir iş parçacığı aynı Hashtable'i kullanabilir.
         kuyruk olusur ve hizmet suresi uzar)

        2) a)HashMap bir tane null key’e (unique olmali, 2 null olamazdi, ustune yazar) ve
                istediginiz kadar null value’a musaade eder
           b)Hashtable, anahtarlar ve değerler için null değerlerine izin vermez.
           Herhangi bir null değer eklemeye çalışırsanız, NullPointerException alırsınız.

        3) HashMap hizlidir, HashTable HashMap’e gore yavastir

        Not: HashMap’ler ve HashTable’lar entry’leri rastgele siralar

        Hangi veri yapısını kullanmalısınız?
        Senkronizasyona gerek yoksa, HashMap kullanın. Bu, daha yüksek performans sağlayacaktır.
        Senkronizasyon gerekliyse, Hashtable kullanın. Bu, veri tutarsızlığı riskini azaltacaktır.*/
        public static void main(String[] args) {

            Hashtable<String, Integer> stdNotes=new Hashtable<>();
            stdNotes.put("Semra", 95);
            stdNotes.put("Yusuf", 100);
            stdNotes.put("Selma", 45);
            stdNotes.put("Seher", 55);
            //stdNotes.put(null, 70);--Hashtable key veya value olrak null kabul etmez exception firlatir

            HashMap<String, Integer> stdAges=new HashMap<>();
            stdAges.put("Ali", 18);
            stdAges.put("Ahmet", 48);
            stdAges.put(null, 28);
            stdAges.put(null, 29);
            stdAges.put("a", null);
            stdAges.put("b", null);
            System.out.println(stdAges);//{null=29, Ahmet=48, a=null, b=null, Ali=18}--HashMapler key olarak da value olrak da null kabul eder

            /*
        1) Treemap’ler entry’leri natural order’a gore siraya koyar, bu yuzden cok yavastirlar
        2) Treemap’ler  thread-safe ve synchronized degildir.
        3) Treemap’lerin key’lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key’e bakarak siralama yapar
         */
            TreeMap<String, Integer> countryPop=new TreeMap<>();
            countryPop.put("Germany", 830000000);
            countryPop.put("Turkey", 890000000);
            countryPop.put("France", 430000000);
            countryPop.put("Holland", 130000000);
            countryPop.put("Italy", null);//value null oalbilir
            //countryPop.put(null, 450000000);//key null olamaz
            System.out.println(countryPop);//{France=430000000, Germany=830000000, Holland=130000000, Italy=null, Turkey=890000000}


            /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız
             */

            LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
            lhm.put("Ali", 25);
            lhm.put("Aliye", 15);
            lhm.put("Ayse", 13);
            for (Map.Entry<String, Integer> w : lhm.entrySet()){
                System.out.println(w.getKey()+"==>"+w.getValue());
                //Ali==>25
                //Aliye==>15
                //Ayse==>13
            }

        }
}
