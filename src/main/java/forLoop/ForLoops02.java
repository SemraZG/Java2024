package forLoop;

public class ForLoops02 {
    public static void main(String[] args) {
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz
        //"Pwd12?Ab" ==> P12?A
        //continue; artirmaya azaltmaya goturur. Altindaki kodlara devam ettirmez, break'de ise direk for'un disina cikarir.
        String s="Pwd12?Ab";
        for (int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else{
                System.out.print(ch);
            }
        }
        System.out.println("=====");

        //ornek: Verilen bir String'i tersden yazan kodu yaziniz. Meshur bir interview sorusu
        //String t = “Ali Can”;  ==> "naC ilA"

        String t2="Ali Can";
        String ters="";
        for (int i=t2.length()-1; i>=0; i--){
            ters=ters+t2.charAt(i);
        }
        System.out.println(ters);

        System.out.println(" ======");
        //2.way
        String t="Ali Can";
        for (int i=t.length()-1; i>=0; i--){
            System.out.print(t.charAt(i));
        }

    }
}
