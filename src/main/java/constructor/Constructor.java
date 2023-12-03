package constructor;

public class Constructor {
    //Constructor Hiyerasisi

        /*

        Constructor nedir?
            Classtan object olusturmamizi saglayan bolumdur.
            Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
            Bu constructor’lara “default constructor” denir.
            default constructor ===> Car ()

            Ama car class'i bize hep ayni degerleri gonderir. Bu class'i kullanip farkli degerler olusturabiliriz.
            Kendiniz constructor’inizi olusturdugunuz zaman Java default constructor’i siler
            ---------
            Constructor nasil olusturulur?
            Access Modifier + Class ismi + () + {}


        Child class’tan bir object olusturdugunuzda constructor’lar en ustteki parent class’tan
        baslatilarak alta doğru calistirilir

        Düşünün ki bir otomobil üreticisi olduğunuzu ve farklı türde otomobiller üretiyorsunuz.

            1- Grandparent Class: Bu class, tüm otomobillerin temel özelliklerini içerir.
            Örneğin, otomobillerin markası, modeli, yakıt türü gibi ortak özellikleri burada tanımlanır.
            Bu sınıfın bir constructor'ı vardır ve yeni bir otomobil oluşturulduğunda bu constructor çağrılır.
            Bu constructor, otomobilin temel özelliklerini ayarlar.

            2- Parent Class: Bu class, Grandparent sınıfını genişletir ve daha özelleştirilmiş otomobil türlerini temsil eder.
             Örneğin, sedan otomobillerin özellikleri burada tanımlanabilir.
             Parent sınıfının constructor'ı, hem kendi özelliklerini hem de miras aldığı Grandparent sınıfının
             özelliklerini ayarlar.

            3- Child Class (Çocuk Sınıf): Bu class, Parent sınıfını genişletir ve daha spesifik bir otomobil türünü
            temsil eder, örneğin spor otomobillerini. Child sınıfının constructor'ı, hem kendi özelliklerini
            hem de miras aldığı Parent ve Grandparent sınıflarının özelliklerini ayarlar.

            **Yukarıdan aşağıya doğru constructorlar sırasıyla çalışır

            Sonuc: Her bir class, daha özelleştirilmiş bir otomobil türünü temsil eder ve her biri üst
            class özelliklerini miras alır ve kendi özelliklerini ekler*/


    //constructor olusturalim
}
