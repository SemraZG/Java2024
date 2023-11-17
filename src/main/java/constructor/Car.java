package constructor;

public class Car {
/*          1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle
            main methoduna ihtiyaç duymazsınız.
            2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
            main methodu oluşturmanız gerekebilir.
            3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method’lu class olur.
             Adina da “runner” eklenir.*/

    //1- variable'lar olusturalim (pasif ozellikler)
    String brand = "Honda";
    String model = "Acord";
    int year = 2023;
    boolean hybrid = true;

    //methodlar olusturalim (aktif ozellikler)
    public void act() {
        System.out.println(brand + " hizli hareket eder");
    }

    public void stop() {
        System.out.println(brand + " guvenli sekilde durur");
    }

    //3- Bunlari olusturduk. CarRunner (main'li) calistirici class'i olusturalim

        /*6-
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

            */

    public Car(String brand, String model, int year, boolean hybrid) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }
    //7- Ozel Constructor'i olusturdugumuzda Java default olani sildi
    //runner'a gidip 4 argumani girelim

    //11-iki tane daha custom constructor olusturalim

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //10- toString methodu objeyi yazdirmak icin sadece

    //12-Runnera gidip yeni cunstructor ile obje uretelim


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';

    }
}