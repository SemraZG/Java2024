package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

    /*LinkedList: Bağlı bir listedir.

       LinkedList’ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
       LinkedList'in içinde bulunan node'ların konumunu temsil eder.

       ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
       Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
       Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

       1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
       Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
       başlayarak ilerlemeyi gerektirir. Yani ArrayList’e gore erisim yavastir.
       ArrayList’lerde get(index) ile hizli erisiriz. Ama LinkedList’ler en bastan istenen eleman mi diye
       tek tek bakar.

       2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

       3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/
    ArrayList<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();//yukaridakini bu sekilde de yazabiliriz, List zaten ArrayList in parenti.

    //List<String> list3 = new List();HATA--ikinci tarafta ArrayList yazmak zorundayim.

    LinkedList<String> myList=new LinkedList<>();
    myList.add("Ali");
    myList.add("Veli");
    myList.add("Aliye");
    myList.add("Ayse");
        System.out.println(myList);//[Ali, Veli, Aliye, Ayse]

      myList.add(1, "Zeynep");
        System.out.println(myList);//[Ali, Zeynep, Veli, Aliye, Ayse]

//3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("Hasan");
        System.out.println(myList); //[Hasan, Ali, Zeynep, Veli, Ayse, Fatma]

        //------------------
        //4- addLast(E e): Listenin sonuna bir öğe ekler.
        myList.addLast("Huseyin");
        System.out.println(myList); //[Hasan, Ali, Zeynep, Veli, Ayse, Fatma, Huseyin]

        //------------------
        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur
        boolean m1 = myList.remove("Ali"); //buyuk kucuk harfe duyarli. ali yazilirsa bulamaz
        System.out.println(m1); //true
        System.out.println(myList);

        //------------------
        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.add("Yusuf");
        myList.add(3,"Yusuf");
        System.out.println(myList); //[Hasan, Zeynep, Veli, Yusuf, Ayse, Fatma, Huseyin, Yusuf]

        myList.removeFirstOccurrence("Yusuf");
        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Huseyin, Yusuf]

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.removeLastOccurrence("Yusuf");
        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Huseyin]

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.

        String s = myList.peek();
        System.out.println(s); //Hasan
        System.out.println(myList); //[Hasan, Zeynep, Veli, Ayse, Fatma, Huseyin]

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.

        System.out.println(myList.poll()); //Hasan
        System.out.println(myList); //[Zeynep, Veli, Ayse, Fatma, Huseyin]

        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(myList.element()); //Zeynep
        System.out.println(myList); //[Zeynep, Veli, Ayse, Fatma, Huseyin]

        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(myList.pop()); //Zeynep
        System.out.println(myList); //[Veli, Ayse, Fatma, Huseyin]

    }

}
