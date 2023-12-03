package exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        /*Exception: Kod çalıştırıldığında akışı bozan hatalardır. "Beklenmedik sorunlar" demektir.
        Her exception, hata mesajını ve hata türüne ait bilgiyi içinde bulundurur.

        1- exception (İstisnalar) , normal kod yürütme akışını bozan hatalardir.

        2- exception bir classtir. Methodlari vardir. Kendi icinde hata kodlari, bilgi mesajlari vardir.
        Ornegin; classtaki bir method cagirildigi zaman kod calismaya baslar. Bu andan itibaren kodlar satir satir
        okunmaya baslar. Ve kodlarda bir hata varsa, exception durumu olusur.

        Tabi bu hatalari developer onceden ongorup handler etmeli, duzeltmelidir ama kullanici programimizi
        kullanirken ongorulmeyen durumlar her zaman olusabilir. Bir hata olustugunda neden kaynaklandigini
        ogrenip cozmek, o an cozulemiyorsa da sistemin durmayip calismasinin devam etmesi icin alternatif
        cozumler uretmek gerekiyor

        3- Bir exception oluştuğunda, kod yürütme durur. Exception’lar, hata ayıklama günlüklerinde(log) oturum açar.

        4- Exception Handling, Java’da, akışı kesintiye uğratmadan kodumuzdaki istenmeyen istisnaları
        veya sorunları işlememize olanak tanıyan bir yöntemdir

        5- Exception denince akliniza 3 seyin gelmesi lazim. try, catch ve finally (optional).

        6- Kod başarılı bir şekilde çalışmadığında bile, kullanıcı deneyiminin sorunsuz olmasını sağlamak için,
        tüm yürütmeleri bir try catch ifadesine sarmak programlama dünyasında en iyi uygulama olarak kabul edilir.
        Ancak, tüm kodları körü körüne try-catch blokları içine almak her zaman en iyi pratik değildir.
        Bu, hataları maskeleyebilir ve programın gerçek hataları gizlemesine yol açabilir.

        Butun exceptions listesi:
        https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
         */

        bolme(6,0);//Lutfen 0 girmeyiniz yazisini aldik
        bolme2(1,0);//Lutfen sifira bolme islemi yapmayiniz
    }//main disi

    //1) ArithmeticException : Matematik kurallarinda herhangi bir hata yaparsaniz bu exception'i alirsiniz
    public static void bolme(int a, int b) {
        if (b == 0) {//Burada matematikte olabilecek butun hata durumlarini bilmeliyim.
                    //Bu cozum onerilmez. try-catch kullanalim
            System.out.println("Lutfen 0 girmeyiniz");
        } else {
            System.out.println(a / b);
        }
    }

    //try-catch kullandiginizda sistem tarafindan "try" bolumu calistirilir,
    // eger "try" bolumunde hata ile karsilasilmazsa "catch" blogu hic calismaz
    //Eger "try" bolumunde hata ile karsilasilirsa hata alinan satirda calisma durdurulur
    // ve "catch - yakalamak" bolumu calismaya baslar.

    public static void bolme2(int a, int b){
        try{
            System.out.println(a/b);//hata alininca burda calisma durur
            System.out.println("Try ici gorev tamamlandi");//burasi calistirilmadi hata alinijnca direk catch bloguna gecti
//       if (b==0){
//           throw new ArithmeticException("Sifira bolme hatasi");--->Exception u kendimiz de firlatabiliriz
//       }
        }catch (ArithmeticException e){// e bir variab dir
            System.out.println("Lutfen sifira bolme islemi yapmayiniz");
        }
        System.out.println("Try cathch sonrasi kod akisi devam ediyor");
    }

}
