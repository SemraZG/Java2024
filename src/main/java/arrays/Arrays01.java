package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
/*
        Array - dizi
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler, bir String dizisi sadece String değerler saklayabilir.
            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer, Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
            6)Array’ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
            7)Genelde degismeyecek datalar icin Array yapilari uygundur.
        */

        //Array olusturmak
        String[] stdNames=new String[3]; // == String stdNames[]=new String[3]; == String stdNames={Ali Can, Veli Can, Ali Canan};
        System.out.println(stdNames);//@4617c264--> stack memorydeki referance, adres
        System.out.println(Arrays.toString(stdNames));//[null, null, null]

        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz
        int[] notlar=new int[5];
        System.out.println(Arrays.toString(notlar));//[0, 0, 0, 0, 0]

        //ornek: 7 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz
        Integer [] integers=new Integer[7];
        System.out.println(Arrays.toString(integers));//[null, null, null, null, null, null, null]

        //ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] isimler = new String[3];
        isimler[0]="Ali Can";
        isimler[1]="Veli Can";
        isimler[2]="Ali Canan";
        System.out.println(Arrays.toString(isimler));//[Ali Can, Veli Can, Ali Canan]

        //Bir veriyi gormek icin ise;
        System.out.println(isimler[0]);//Ali Can

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.
        String [] cities=new String[5];
        cities[0]="Ankara";
        cities[1]="Amasya";
        cities[2]="Samsun";
        cities[3]="Istanbul";
        cities[4]="Antalya";
        System.out.println(Arrays.toString(cities));//[Ankara, Amasya, Samsun, Istanbul, Antalya]

        int totalchar=0;
        for (int i=0; i< cities.length; i++){
            totalchar=totalchar+cities[i].length();
        }
        System.out.println(totalchar);

        //2.yol: for each loop (enhanced - gelistirilmis dongu)
        //for loop'taki baslangic, bitis, artirma-azaltma olaylarini dusunmeyiz

       /* for(DataType variable (w) : array yada collectionin adi){
            //calisacak kodlar
        }*/
        //variable ismi olarak da w genel kabul gormustur

        int sum=0;
        for (String w : cities){
            sum=sum+w.length();
        }
        System.out.println(sum);

    }
}
