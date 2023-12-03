package collections;

public class Collections {
    /*Collections (koleksiyonlar), Object’leri depolamak ve işlemek için kullanılan
        bir class’lar ve interface'ler kümesidir.

        Collections:
        1-List           2-Queue    3-Set
        1.i) ArrayList
        2.ii)LinkedList
        3.iii)Vector


    —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
        Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
        Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
        Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
        Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

    —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
        Verileri verimli bir şekilde depolamak
        Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
        Verileri güvenli bir şekilde depolamak*/


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

    //Set'ler tekrarsiz (unique) datalari depolamak icin kullanilir
    //Ornegin; tc kimlik, parmak izi, e mail, ehliyet, il plaka no
}
