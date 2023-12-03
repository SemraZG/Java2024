package stringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {

        //1-reverse(): StringBuilder Object'inin içeriğini ters çevirir.String class'ta yoktur
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy

        sb1.reverse();
        System.out.println(sb1); //ysae si avaJ

        //2- deleteCharAt(int index): Belirtilen konumda(index'te) bulunan karakteri siler.
        sb1.deleteCharAt(1);
        System.out.println(sb1); //yae si avaJ, s silindi

        //3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.
        sb1.delete(0,2);
        System.out.println(sb1); //e si avaJ, ya silindi

        //4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki
        // karakterleri verilen stringle değiştirir.

        sb1.replace(0,2,"hasan");
        System.out.println(sb1); //hasansi avaJ

        //5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
        // offset aslinda index degildir ama index'mis gibi sayabiliriz

        sb1.insert(2,"34");
        System.out.println(sb1); //ha34sansi avaJ

        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
        // int değeri döndürür.Sozluk gibidir.
        // Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa,negatif deger döndürür.
        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden
        // sonra geliyorsa, pozitif deger döndürür.
        // farkli olan iki harfin ascii kodlari arasindaki farki verir.
        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur

        StringBuilder sb2 = new StringBuilder("Zava");
        StringBuilder sb3 = new StringBuilder("Kava");
        int result = sb2.compareTo(sb3);
        System.out.println(result); //15

        //7-StringBuilder, String'e gore zengin bir class degildir.Mesela toUpperCase,split yoktur.
        //toString() metodu, StringBuilder nesnesinin içeriğini bir String nesnesine dönüştürür.

        String str = sb1.toString().toUpperCase();
        System.out.println(str); //HA34SANSİ AVAJ

        //String nasil StringBuilder'a cevirilir?
        // cevirmek istedigimiz String'i StringBuilder'in parantezi icine parametre olarak gondeririz

        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1); //HA34SANSİ AVAJ

        //-------------------------
        //StringBuffer

        /*
        1) StringBuffer Java’da String ureten bir diger classtir.
            StringBuffer Java’nin String uretmek icin olusturdugu ilk classtir
        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable-degistirilebilir" String uretir
        3) StringBuffer "multi-thread(coklu is parcacigi)" dir, ama StringBuilder "multi-thread" degildir.
        4) StringBuilder  "multi-thread" olmadigi icin StringBuffer’dan daha hizli calisir
        5) Multi-thread yapilirken, yapilan islerin siralamasi onem arzeder. Yapilan isleri mantikli bir
        siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread oldugu icin ayni zamanda synchronized’dir

        Uc tane String olusturan class ogrendik;
        1) Immutable String lazimsa ==> String class
        2) Mutable String lazimsa , StringBuilder veya StringBuffer
                        a) StringBuilder'i multi-thread gerekmezse kullaniriz
                        b) StringBuffer'i multi-thread gerekirse kullaniriz

 */

        /*Tek iş parçacığı, aynı anda sadece bir görevi işleyebilirken, birden fazla iş parçacığı
        aynı anda farklı görevleri işleyebilir ve böylece
        işlerin daha hızlı ve etkili bir şekilde tamamlanmasına olanak tanır.
        */

        /*Basitlik ve Öngörülebilirlik: Tek iş parçacığı, programın daha basit ve öngörülebilir olmasını sağlar. Bu nedenle küçük ve basit uygulamalarda tek iş parçacığı kullanmak daha kolaydır.

	Kaynak Kontrolü: Tek iş parçacığı, belirli kaynakları (örneğin, dosya erişimi) kontrol altında tutmayı daha kolaylaştırır. Birden fazla iş parçacığı kullanmak, kaynakların paylaşılması ve senkronizasyon gerektirebilir, bu da daha karmaşık hale gelebilir.

	Performans Optimizasyonu: Bazı görevler tek iş parçacığı ile daha iyi çalışabilir. Özellikle, işlemci yoğun görevlerde tek iş parçacığı daha basit bir yaklaşım sunabilir. Ayrıca, belirli işlerin sıralı olarak yapılması gerektiğinde tek iş parçacığı kullanmak mantıklı olabilir.

	Platform Bağımsızlık: Tek iş parçacığı, farklı işletim sistemlerinde ve platformlarda daha tutarlı bir davranış sağlar. Birden fazla iş parçacığı kullanırken platforma bağımlı sorunlar ve davranış farklılıkları ortaya çıkabilir.

	Veri Bütünlüğü: Tek iş parçacığı, veri bütünlüğünü korumak için daha kolay bir şekilde yönetilebilir. Birden fazla iş parçacığı kullanırken, veri bütünlüğü sorunlarına dikkat etmek ve senkronizasyon mekanizmalarını kullanmak gerekebilir.*/
    }
}
