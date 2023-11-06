package forLoop;

public class ForLoops04 {
    //ornek 1: 6'dan 10'a kadar tum int’lerin (Integer) toplamini console'a yazdiriniz
    //           6+7+8+9+10=40 ==> 40

    //ONEMLI: Bu tarz toplam sorularinda ilk hamleniz, memory'de toplami depolayabileceginiz bir alan olusturmaktir
    public static void main(String[] args) {

        int sum=0;
        for (int i=0; i<11; i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
