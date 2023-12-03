package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //interview sorusu
        //ornek 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz

        //Mail'ler unique(benzersiz). O yuzden set kullanacagiz, natural order dedigi icin de TreeSet kullanacagiz
        //System.nanoTime(); methodu genellikle performans olcumu icin kullanilir

        //System.nanoTime() yontemi genellikle performans olcumu icin kullanilir kronometre gibi
        long t1=System.nanoTime();

        //1.way: her elemanda siralama yapar TreeSet ama yavastir
        TreeSet<String> emails=new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        emails.add("d@gmail.com");
        emails.add("e@gmail.com");
        emails.add("f@gmail.com");
        emails.add("g@gmail.com");
        emails.add("h@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);//natural ordera gore(buyukten kucuge) siraladi
        //[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, e@gmail.com, f@gmail.com, g@gmail.com, h@gmail.com, m@gmail.com]

        long t2=System.nanoTime();

        //2.way--tavsiye edilen-->Daha hizlisini istersek HashSet kullanmaliyiz
        HashSet<String> emailsHs=new HashSet<>();
        emailsHs.add("a@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("d@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("f@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("h@gmail.com");
        emailsHs.add("m@gmail.com");
        System.out.println(emailsHs);//rastgele siraladi
        //[b@gmail.com, f@gmail.com, g@gmail.com, c@gmail.com, h@gmail.com, e@gmail.com, m@gmail.com, d@gmail.com, a@gmail.com]

        //Bos bir TreeSet olusturslim ve constructor ina HashSet yazalim
        //boylece daha hizli olanla olusturup(HashSet ile) daha sonra silarama icin TreeSet e cevirdik
        TreeSet<String> emailsHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);
        //[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, e@gmail.com, f@gmail.com, g@gmail.com, h@gmail.com, m@gmail.com]

        long t3=System.nanoTime();

        System.out.println("TreeSet"+(t2-t1));
        System.out.println("HashSet"+(t3-t2));
    }
}
