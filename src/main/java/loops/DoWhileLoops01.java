package loops;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {
         /**
          //---------------while
                Baslangic degeri
                while (loop calisma kurali){
                calisacak kodlar
            artirma/eksiltme


        //--------------do while
            Baslangic degeri
            do{
            calisacak kodlar
            artirma/eksiltme
        }while (loop calisma kurali);

          while loop ile do while loop'un farki nedir?
          while loop'ta loop'un en basta kirilmasi mumkundur cunku kural kontrol edilir sonra islem yapilir

          */

        //do while dongusu, dongu blogundaki kodun en az bir kere calisacagindan emin olmak istedigimiz zaman kullanilir.
        //do while loop'ta loop'un en basta kirilmasi mumkun degildir. Once 1 kere calistirilir

        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz
        int i=5;
        do {
            System.out.println(i);
            i--;
        }while (i>2);

        //while loop ile cozumu
        int k=5;
        while (k>2){
            System.out.println(k);
            k--;
        }

         /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.

       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
        */

        Scanner input = new Scanner(System.in);

        int counter=0;

        do {

            if (counter == 4) {
                System.out.println("Your account was blocked");
                break;
            }

            System.out.println("Please enter your username");
            String username = input.next();
            System.out.println("Please enter your password");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome");
                break;
            }
            counter++;


        }while (true);//sonsuz dongu olusturduk. Dongu iceriden kirilmadigi surece calisacak

    }
}
