package stringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1) "StringBuilder" classi da String ureten bir classtir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) String uretir,
            StringBuilder Class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli
        yöntemler ve işlevler içerir. Bunlar arasında append, delete, insert,
        replace gibi sık kullanılan yöntemler bulunur.
        */

        //immutable - degistirilemez -String class
        String s="Java";
        String t=s+"x";
        String k=t+"?";

        String c="Ali";
        String c2=new String("Ali");
        //Java cok kullandigimiz bazi seyleri sadestirmis ve bellegi daha verimli kullandirmis, new keywprdunu kullanmadan /string classi kullanabiliyoruz

        //String Builder - Mutable - degistirilebilir

        //StringBuilder b = "Ali"; ---->HATA
        StringBuilder sb = new StringBuilder("Python");
        System.out.println(sb); //Python

        sb.append("!");
        System.out.println(sb); //Python!

        //Odev : Bir String'i degistirdikten sonra tekrar ayni String'e yuklersem orjinal deger degismez mi?

        String a = "Money";
        a = a + " More";
          /**
        1=>String’i degistirdikten sonra ayni String’e assign ederseniz Java yine yeni bir container olusturur.
        2=>Degismis degeri bu yeni container’in icine koyar ve eski container’i gosteren pointer yeni
        container’a yonlendirilir
        3=>Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
        adressiz olan container’lari siler. GC bellek sızıntılarını önler. GC, Java'nın birçok
        uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.Veri
        memory’de sahipsiz ve guvenliksiz bir sekilde beklemez.
        4=>GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir
        ve uygulamadan bağımsızdır*/

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity()); //16

        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxxxx");
        System.out.println(sb1.length()); //4, sb1.append("xxxxxxxxxxxxxxx"); ekledikten sonra 19
        System.out.println(sb1.capacity()); //16, sb1.append("xxxxxxxxxxxxxxx"); ekledikten sonra 34

        /*capacity Java’nin size verdigi data depolama yer sayisidir,
        length ise size verilen data depolama yerinin kullanilan kismidir

        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity’i asarsaniz Java yeni capacity’i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/

        //Default Capacity'yi (16 karakter) nasil degistirebiliriz?

        StringBuilder sb2 = new StringBuilder(3); //constructor kismina int bir deger yazilirsa capacity degistirilir
        System.out.println(sb2.append("Alis"));
        System.out.println(sb2.capacity()); //8 //default(3) * 2 + 2 ==> 8 oldu



    }
}
