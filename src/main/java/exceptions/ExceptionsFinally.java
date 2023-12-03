package exceptions;

public class ExceptionsFinally {
    public static void main(String[] args) {
        /*
        //finally blogu
        1) finally bloğu genellikle;
         a) Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi, close() methodu ile),
             Özellikle eski Java versiyonlarında (Java 7 öncesi), veritabanı bağlantıları gibi kaynaklar
             manuel olarak kapatılmalıydı. Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz
             yere yer kaplar ve potansiyel performans sorunlarına neden olabilir.
             Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile)

         b) Dosyaların kapatılması :  (az once dosya baglantisi yapmistik.  fis.close(); ile kapatilabilirdi)
            Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. Aksi halde, dosya kolları
             gereksiz yere sistemde yer kaplar.

         c) Her durumda çalıştırılması gereken temizleme işlemleri :
         (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir sürecin sonunda her zaman yapılmalıdır.
         Örneğin, bir log dosyasına her işlemin başlangıç ve bitiş zamanını kaydetmek gibi.
         BufferedWriter ile)

         finally icin bir senaryo olusturalim; a/b bolumu ile bir index bulalim ve bu index'i kullanarak
         Array'deki elemani bulalim
         */

    }
}
