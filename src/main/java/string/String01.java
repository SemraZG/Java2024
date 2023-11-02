package string;

public class String01 {
    public static void main(String[] args) {
        String s="Java is easy";
        int sLenght=s.length();//space ler de uzunlukyan sayilir

        //ilk ve son karakteri bulma
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        System.out.println(first);
        System.out.println(last);

        //ilk 4 karakteri bulma-->substring methodu(0,4) 0'dan basla 4. indexe kadar al demek, 4.index haric
        String firstFour=s.substring(0,4);
        System.out.println(firstFour);
        //is kelimesini bulunuz
        String is=s.substring(5,7);
        System.out.println(is);
        //easy kelimesini aliniz
        String easy=s.substring(8);
        System.out.println(easy);


        //Bir stringin belirli bir karakterinden baslayarak belirli bir karaktere kadar tum karakterleri dynamic olarak aliniz
        //abc@gmail.com==>gmail
        String a="abc@gmail.com";
        a=a.split("@")[1];
        a=a.split("\\.")[0];   //split methodunda '.' kullandigimizda onune '\\' koymaliyiz.
        System.out.println(a);
        //2.yol
        String a2="abc@gmail.com";
        int startingInd=a2.indexOf("@")+1;
        int endindInd=a2.indexOf(".");
        a2=a2.substring(startingInd, endindInd);
        System.out.println(a2);
    }
}
