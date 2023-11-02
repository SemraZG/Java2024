package forLoop;

public class ForLoops01 {
    public static void main(String[] args) {
                /*loop - dongu demektir
        Donguler tekrar eden kodlama islerini kolaylastirmak icin kullanilir

        Java da;

        1-for loop
        2-while loop
        3-do while loop
        4-for each (Collection'larda)

        */

        //1-for loop
        //for dongusu, temel olarak bir kod blogunu belirli sayida ve ust uste calistirmak icin kullanilir
        //yineleme - iteration

        //ornek 1: Console'a 4 kere "Hi!" yazdirin
        for (int i=1; i<5; i++ ){
            System.out.println("Hi!");
        }

        //ornek 2: 20 (dahil) den 3 (dahil) e kadar tum tamsayilari console'a yazdiriniz.
        for (int i=20; i>2; i--){
            System.out.print(i+" " );
        }

        System.out.println();

        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(3 ve 20 dahil)
        for (int i=3; i<21; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("=======");
        // /*Ornek 1: Verilen bir String’de ilk ‘a’ harfinden onceki tum character’leri console’a yazdiriniz.
        //        ==> “Tramvay”==> “Tr”

        //        //break; bir donguyu erken bir sekilde sonlandirmak icin kullanilir
        String s = "Tramvay";
        for (int i=0; i<s.length(); i++ ){
            char ch=s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
            System.out.println("========");

            System.out.println("+=++++");
        }
    }
}
