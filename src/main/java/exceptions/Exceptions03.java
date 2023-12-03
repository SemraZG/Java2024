package exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException:
        // bir String nesnesinin karakter dizisindeki geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s="Java";
        karakterSec(s,10);
    }

    public static void karakterSec(String s, int idx) {
        //charAt() verilen indexdeki elemani getirir.
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Stringin boyutunun diisnda bir index girmeyiniz");
            e.printStackTrace(); //developer hatalari gormek isterse kullanir, exception gibi alttaki kodlar da bundan sonra calismya devam eder.
        }
    }

 }
