package exceptions;

public class Exceptions06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi)
        // Null degerindeki bir variable referans olarak kullanildiginda olusur
        String s="Java";
        karakterSayisi(s);//4
        String t="";
        karakterSayisi(t);//0
        String m=null;
        karakterSayisi(m);

    }//main disi
        public static void karakterSayisi(String s){
            try {
                int a=s.length();
                System.out.println(a);
            } catch (NullPointerException e) {
                System.out.println("Null degeri ile lenght methodunu kullanmayiniz");
            }
        }
}
