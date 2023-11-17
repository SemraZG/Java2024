package dateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateandTime01 {
    public static void main(String[] args) {
        //"Date" data type(Class)
        //ornek 1: now(): Geçerli tarihi alır.
        //Tarih bilgisini yerel bilgisayarınızın saatinden alır, yani sizin bilgisayarınızın saatinden gelir

        LocalDate myDate=LocalDate.now();//now() methodunu Class ismiyle cagirdigimiz iicn  static dir, obje uretseydik non-static olcakti.
        System.out.println(myDate);//2023-11-14

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //Java’da Month veri türü, bir Enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir.Haftanin gun isimleri, Ay isimleri gibi

        System.out.println(myDate.getMonthValue());//11
        Month month=myDate.getMonth();
        System.out.println(month);//NOVEMBER

        //getYear(); Tarihin yilini alir
        System.out.println(myDate.getYear());

        //ornek 4:getDayOfMonth(): Ayin gününü alır.
       int gun= myDate.getDayOfMonth();
        System.out.println(gun);


        //ileriki tarihe nasil gidilir?

        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        // Bu methodlar, orijinalleri değiştirmez, yeni bir gun,ay ve tarih nesnesi oluşturur.

        LocalDate newDate=myDate.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println(newDate);//2025-01-18

        /*ornek 6:Gecmis tarihe nasil gidilir?
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.
*/

        System.out.println(myDate.minusYears(2).minusMonths(3).minusDays(21));

        //ornek 7: Specifik bir tarih objesi nasil olusturulur?
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate specificDate=LocalDate.of(1993,12,3);
        System.out.println(specificDate);//1993-12-03
        LocalDate specificDate2=LocalDate.of(2010, 5,23);
        System.out.println(specificDate2);

       Boolean isLeap= specificDate.isLeapYear();
        System.out.println(isLeap);

        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz. yil-ay-gun");
        int year= input.nextInt();
        int mounth= input.nextInt();
        int day= input.nextInt();

        LocalDate girilenTarih=LocalDate.of(year, mounth, day);
        if (girilenTarih.isBefore(LocalDate.now())){//girilen tarih su andan once mi?
            System.out.println("Gecersiz tarih girdiniz");
        }else{
            System.out.println("Zamani girebilirsiniz");
        }

        //ornek 9: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Lutfen verilen sirada dogum tarihinizi giriniz. yil-ay-gun");
        int y= input.nextInt();
        int m= input.nextInt();
        int d= input.nextInt();
        LocalDate birthday=LocalDate.of(y,m,d);
        System.out.println(birthday.getDayOfWeek());








    }
}
