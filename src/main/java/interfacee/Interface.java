package interfacee;

public class Interface {

    /*
    Interface (arayüz), class'larin uygulayabileceği bir "sözleşme" olarak düşünülebilir.
    Bir interface, bir veya daha fazla abstract method içerir ve
    bu methodların imzalarını (adlarını ve parametrelerini) belirtir,
    ancak bu methodların nasıl uygulanacağını tanımlamaz.
    Class'lar, bu interface'leri uygulayarak (implement ederek) bu methodları
    kendi ihtiyaçlarına göre tanımlarlar.
    //------------------
    //i) interface icindeki method’lar otomatik olarak ‘public’ dir,
    // bu yuzden interface’lerde method olustururken access modifier yazmayiz.(static degillerdir)

    //ii) interface icindeki method’lar otomatik olarak ‘abstract’ dir, bu yuzden interface’lerde
    // abstract method olustururken ‘abstract’ keyword’unu ve ‘method body’ sini yazmayiz.
    a) interface’leri parent yapmak icin ‘implements’ keyword’u child icinde kullanilir

    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class’i, Motor interface’i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class’i, Motor interface’i icindeki tum methodlari override etmek zorunda
    oldugundan method’larin bas kismina ‘override’ yazmak gerekmez bu yuzden yazmayiz.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */
   /*
        1) interface’lerden object olusturamazsiniz.(constructor’lari olmadigi icin eksik yapilardir)
        2) interface’ler sadece parent olur
        3) interface’ler yapilmasi sart olan seyleri depolamak icin olusturulur.
        Bu yüzden interface’lere "to do list " de denir.(yapilacaklar listesi)*/

        /*    child         parent

             class           class     ==> extends
             interface       interface ==> extends
             class           interface ==> implements
             interface       class     ==> olamaz

             4) Coklu interface parentlarin her birinin icine ayni isimli methodlar koyabiliriz
            Mesela Motor’un, Klima’nin ve Fren’nin iclerine run() methodu koymak gibi. Child class bu methodu
            override ettiginde bu methodun hangi interface'den geldiği belirsizdir.

            5) Interface’ler de variable’lar default olarak public static final’dir. Yani yazmasaniz da olur

            6) Interface’lerin hepsine ayni isimli variable koyabiliriz. Static olup interface
             uzerinden ulasildigi icin sorun olmaz.

         */
        /*7) Normalde interface icine concrete method konulamaz ama bazi özel durumlarda concrete
    method koymak gerekirse;
        a) default keywordunu kullanarak bunu yapabiliriz
        b) static keywordunu kullanarak bunu yapabiliriz

    ==>  static keywordunu kullanarak olusturdugumuz concrete methodlara ulasmak icin
    object olusturmaya gerek yoktur. Interface ismi yeterlidir

    ==>  default keywordunu kullanarak olusturdugumuz concrete methodlara interface’in child class’indan
    object olusturarak ulasilabilir*/

    /*8) Abstract Class ile Interface arasindaki farklar nelerdir? ***Interview Sorusu***

    a) Abstract class'lar hem abstract method hemde concrete methodlar icerebilir.
    fakat interface’ler abstract method icerir.
       Ama interfacelerde istersek default ve static keywordllerini kullanarak concrete method olusturabiliriz

    b) Abstract class'lar multiple inheritance’i desteklemez ama interface’ler destekler

    c) Abstract class'lar icinde her turlu variable olusturulabilir, interfaceler icindeki variable’lar
    public, static ve final olmak zorundadir

    d) Interface, concrete class'ın child'ı olamaz. Abstract class, concrete class'ın child'ı olabilir.

    e) Abstract class'larda constructor vardir (concrete bir method bu constructor’u istegine gore
    override edebilir) ama object uretemez, interface'lerde constructur yoktur,bu yuzden object uretilemez*/

}
