package ifStatementSwitchTernary;

public class Ternary {
    public static void main(String[] args) {
        //Bir sayinin mutlak degerini hesaplayan kodu yaziniz
        int c=-4;
        int result = c<0 ? -1*c : c ;
        System.out.println(result);

        //2 sayinin isareti ayniysa bunlari carpan, fakliysa "Farkli isaretli sayilari carpamiyorum" yazdirin
        int a= 4;
        int b= -7;
       Object result2= (a>0 && b>0) || (a<0 && b<0) ? (a*b) : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(result2);

        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int d=-123;
        d=Math.abs(d);//Math.abs()--> mutlak degerini verir
        String result3= (d>99 && d<1000) ? "Uc basamaklidir" : "Uc basamakli degildir";
        System.out.println(result3);

    }
}
