package oop.oop.polymorphism;

public class Override {
    /*
    Soru1: private method'lar override edilebilir mi?

    Cevap1: private method'lar override edilemezler (parent ‘eat’)cunku;
    override edebilmek icin o method'a baska bir class'dan ulasabilmek gerekir.
            Ama private method'lar baska classlardan ulasilamaz methodlardir.

            --------------------
    child’in access modifier’i parent’tan daha dar olamaz. Ornek: parent public - child protected olamaz
    cunku bu hata, Child class'ının eat metodunun, Parent class'ının eat metodundan daha az erişilebilir
    olmasından kaynaklanır.

            ----------------------------
    Soru2: static method'lar override edilebilir mi?
    Cevap2: static method'lar override edilemezler cunku; static variable veya method'lar tum objeler icin
    ortaktir. Java static method'larin override edilmesine musaade etmez.

            ----------------------------
    Soru3: static method'lar overload edilebilir mi?
    Cevap3: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
    ornegin; pi sayisini farkli bir method icinde yine kullanabilirsiniz.

            ----------------------------
    final keyword'u

    Override’da ozel bir durum vardir:

            1- Java’da "final" anahtar kelimesi (keyword) ile işaretlenen bir method, alt sınıflar tarafından override edilemez.
            2- Yani, bir sınıfın alt sınıfları, final olarak işaretlenmiş bir methodu değiştiremez veya üzerine yazamaz.
            3- Bu method, final olarak işaretlenerek nihai ve değiştirilemez hale getirilir.
        4- Final Variables, Final Classes, Final Parametreler’de olabilir.

    Sonuc: "Final" kelimesi, programcılara kodlarını daha güvenli ve öngörülebilir hale getirme, optimizasyon sağlama
    veya belirli davranışları zorlamada yardımcı olmak için kullanılır.
            */
}
