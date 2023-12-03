package collections;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);
        stdAges.put("Tom", 33);
        //key'i tekrarli kullandiginizda hata vermiyordu ama bu sekilde yapmak best practice degildir
        stdAges.put("Tom", 35);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=35--Tom'nu update etti, Veli=63, Ali=18}

        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.
        stdAges.replace("Tom", 39);//replace()'i kullanmak stdAges.put("Tom", 35); bu sekilde kullnamaktan daha guzel update yapilmak istendigi daha net

        stdAges.replace("Tom", 33, 40);//eski deger 33 ise 40 yap
        System.out.println(stdAges);
        stdAges.replace("Tom", 39, 40);
        System.out.println(stdAges);

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=40, Veli=63, Ali=18}--Tom zaten var diye kabul etmedi
        stdAges.putIfAbsent("Semra",30);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=40, Veli=63, Semra=30, Ali=18}--Semra yoktu bu yuzden ekledi

        //4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir
        System.out.println(stdAges.get("Semra"));//30--key'i verip value yi aliriz, verilen key yoksa null verir
        System.out.println(stdAges.getOrDefault("Semra", -1));//30--key varsa valuesunu verir
        System.out.println(stdAges.getOrDefault("Seher", -1));//-1--key yoksa default olarak belirtilen value yu verir

        //5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        Boolean b = stdAges.containsValue(19);
        System.out.println(b); //true

        //6)remove("Tom"); methodu key kullanarak entry silmeye yarar
        stdAges.remove("Tom");
        System.out.println(stdAges);//{Can=19, Ahmet=41, Veli=63, Semra=30, Ali=18}--Tom da valuesu da silindi

    }
}
