package enums;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Cities c=new Cities();---Enum dan object uretemeyiz

        //Enumn daki bir sabit'e nasil ulasiriz
        Cities il=Cities.ADANA;
        System.out.println(il);

        //Bursa sabit'inin ismine nasil ulasirim
       String ilIsmi= Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

        //Ankaranin posta kodunu alalim
        System.out.println(Cities.ANKARA.getPostalCode());

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("Plaka kodu giriniz");
        int plaka= input.nextInt();
        //values() methodu enum icindeki tum datalari bir array icinde bize verir
        Cities[] sehirler=Cities.values();
        //System.out.println(Arrays.toString(sehirler));
        if (plaka<1||plaka>81){
            System.out.println("1 ile 81 arasi bir plaka kosu giriniz");
        }else{
            for (Cities w : sehirler){//veri tipi Cities
                if (plaka==w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka: "+w.getCityName()+" iline aittir.");
                    break;//break yazmazsak aradigini bulsa da digerlerini de kontrol eder bu da app i yavaslatir
                }
            }
        }

    }
}

