package exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
    String s="1234a";//kullanici 1234a girerse exception olusur cunku bu sekilde valueOf methodu calismaz
    convertStringToInt(s);
    }

    //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
    public static void convertStringToInt(String s){
       try{
           int intS= Integer.valueOf(s);
           System.out.println(intS+1);//1'i String'i int'e donusturebildik mi diye ekledim.
       }catch (NumberFormatException e){
           System.out.println("donusum icin sayi harici karakter kullanmayiniz: "+e.getMessage());
       }
    }
}
