package loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz. interview sorusu
        //578 ==> 5+7+8=20
        //% (modulus) kullanarak 10' bolersek kalani en sagdaki basamak olur
        //iki int'i biribirine bolersek sonuc int cikar (tamsayi)
        //Java virgulden sonrasini siler, yuvarlama yapmaz

        int sum=0;
        for (int i = 578; i>0; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println("sum= "+sum);



        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf
        String y="Yusuf";
        String unique="";
        for (int i=0; i<y.length(); i++){
            char ch=y.charAt(i);
            if (y.indexOf(ch)==y.lastIndexOf(ch)){
                unique=unique+ch;
            }
        }
        System.out.println(unique);

        //ornek 1: 6'dan 10'a kadar tum int’lerin (Integer) toplamini console'a yazdiriniz
        //           6+7+8+9+10=40 ==> 40

        //ONEMLI: Bu tarz toplam sorularinda ilk hamleniz, memory'de toplami depolayabileceginiz bir alan olusturmaktir

            int sum2=0;
            for (int i=6; i<11; i++){
                sum2=sum2+i;
            }
            System.out.println(sum2);

            //ornek 2: 10'dan 7'e kadar tum int’lerin carpimini console'a yazdiriniz
            //10x9x8x7 ==> 5040

            int multiply=1;
            for (int i=10; i>6; i--){
                multiply=multiply*i;
            }
            System.out.println(multiply);

        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
        //            28.587 ==> 5+8+7=20
        double num=28.587;
        String sNum= String.valueOf(num);//"28.587"
        String decPart= sNum.split("[.]")[1];//"587"
        int intDecPart= Integer.valueOf(decPart);//Integer da methodlar var valueOf() gibi.

        int sum3=0;
        for (int i=intDecPart; i>0; i=i/10){
            sum3=sum3+i%10;
        }
        System.out.println(sum3);

    }
}
