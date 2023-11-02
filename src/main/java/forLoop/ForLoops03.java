package forLoop;

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
    }
}
